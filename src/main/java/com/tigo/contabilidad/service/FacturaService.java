package com.tigo.contabilidad.service;

import com.tigo.contabilidad.entity.Factura;
import com.tigo.contabilidad.repository.FacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FacturaService {

    @Autowired
    private FacturaRepository facturaRepository;

    public List<Factura> getAllFacturas() {
        return facturaRepository.findAll();
    }

    public Optional<Factura> getFacturaById(Long id) {
        return facturaRepository.findById(id);
    }

    public Factura saveFactura(Factura factura) {
        // Basic validation example
        if (factura.getMonto() <= 0) {
            throw new IllegalArgumentException("Monto debe ser positivo");
        }
        return facturaRepository.save(factura);
    }

    public void deleteFactura(Long id) {
        facturaRepository.deleteById(id);
    }
}
