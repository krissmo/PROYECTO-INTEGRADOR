Tigo Contabilidad Microservicios


El proyecto Tigo Contabilidad Microservicios es una aplicación web desarrollada con Spring Boot, Thymeleaf y MySQL, que permite gestionar facturas de manera sencilla.

El sistema soporta las operaciones básicas de CRUD (Crear, Leer, Actualizar, Borrar) sobre facturas, incluyendo:

Agregar facturas: Registrar una nueva factura con descripción, monto y fecha.
Listar facturas: Visualizar todas las facturas registradas.
Editar facturas: Modificar los datos de facturas existentes.
Borrar facturas: Eliminar facturas no deseadas.

El proyecto se diseñó como un microservicio contable, pensado para integrarse en sistemas más grandes o para servir como ejemplo funcional de aplicaciones web con persistencia de datos en MySQL.


Tecnologías utilizadas
Java 17+
Spring Boot 3.2
Spring Data JPA
Thymeleaf para plantillas HTML
MySQL 8+ (o compatible)
Maven como sistema de construcción y dependencias
Bootstrap (opcional) para estilo visual básico


Requisitos
Java 17 o superior instalado.
Maven instalado (aunque se incluye el wrapper ./mvnw).
MySQL corriendo localmente o en servidor accesible.
Instalación y Configuración


Cómo ejecutar
Desde la terminal, ejecutar el microservicio:
./mvnw spring-boot:run
Acceder al navegador en: http://localhost:8080


Funcionalidades disponibles:
Listar facturas: en la página principal (/)
Agregar factura: click en "Agregar Factura"
Editar factura: click en "Editar" (si se implementa en el template)
Borrar factura: click en "Borrar" (si se implementa en el template)


Estructura del proyecto
tigo-microservices/
├─ src/main/java/com/tigo/contabilidad/
│  ├─ controller/      # Controladores de Spring MVC
│  ├─ entity/          # Entidades JPA (Factura)
│  ├─ repository/      # Interfaces de acceso a datos
│  ├─ service/         # Servicios (logica de negocio)
│  └─ ContabilidadServiceApplication.java  # Clase principal
├─ src/main/resources/
│  ├─ templates/       # Plantillas Thymeleaf (index.html, add-factura.html)
│  └─ application.properties # Configuración
└─ pom.xml             # Dependencias y configuración Maven


Funcionalidades a futuro (opcional)
Agregar validaciones de frontend y mensajes de error en Thymeleaf.
Implementar login y roles de usuario.
Mejorar la interfaz con CSS/Bootstrap.
API REST para integraciones externas.


Conclusión
El proyecto ya es totalmente funcional y permite gestionar facturas de manera completa. Es ideal como ejemplo académico, demostración de Spring Boot con MySQL o como base para un sistema contable más grande.
