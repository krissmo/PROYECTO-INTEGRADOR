package com.tigo.contabilidad.controller;

import com.tigo.contabilidad.entity.Factura;
import com.tigo.contabilidad.repository.FacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.time.LocalDate;
import java.util.Optional;

@Controller
public class FacturaController {

    @Autowired
    private FacturaRepository facturaRepository;

    @GetMapping("/")
    public String listarFacturas(Model model) {
        model.addAttribute("facturas", facturaRepository.findAll());
        return "index";
    }

    @GetMapping("/add")
    public String mostrarAgregarFactura(Model model) {
        model.addAttribute("factura", new Factura());
        return "add-factura";
    }

    @PostMapping("/add")
    public String guardarFactura(@Valid @ModelAttribute Factura factura, BindingResult result) {
        if (result.hasErrors()) return "add-factura";
        factura.setFecha(LocalDate.now());
        facturaRepository.save(factura);
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String mostrarEditarFactura(@PathVariable Long id, Model model) {
        Optional<Factura> opt = facturaRepository.findById(id);
        if (opt.isPresent()) {
            model.addAttribute("factura", opt.get());
            return "edit-factura";
        } else {
            return "redirect:/";
        }
    }

    @PostMapping("/edit/{id}")
    public String actualizarFactura(@PathVariable Long id, @Valid @ModelAttribute Factura factura, BindingResult result) {
        if (result.hasErrors()) return "edit-factura";
        factura.setId(id);
        facturaRepository.save(factura);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String borrarFactura(@PathVariable Long id) {
        facturaRepository.deleteById(id);
        return "redirect:/";
    }
}
