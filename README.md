# Wasap 3.0 - Microservicio de Usuarios

## Descripción

Microservicio encargado de la gestión de usuarios dentro del proyecto Wasap 3.0. Permite consultar información de usuarios mediante una API REST y almacena los datos utilizando persistencia con Spring Data JPA y H2.

## Tecnologías

* Java 17
* Spring Boot
* Spring Data JPA
* H2 Database
* Swagger/OpenAPI

## Requisitos

* Java 17
* Maven

## Ejecución

### Windows

```bash
mvnw.cmd spring-boot:run
```

### Linux

```bash
./mvnw spring-boot:run
```

## Endpoints

Base URL:

```text
http://localhost:8081/users
```

### Obtener todos los usuarios

```http
GET /users/
```

### Obtener usuario por ID

```http
GET /users/{id}
```

Ejemplo:

```http
GET /users/1
```

## Persistencia

La aplicación utiliza Spring Data JPA y una base de datos H2 en memoria para almacenar la información de los usuarios.

### Consola H2

```text
http://localhost:8081/h2-console
```

Configuración:

```text
JDBC URL: jdbc:h2:mem:userdb
User: sa
Password:
```

## Documentación Swagger

```text
http://localhost:8081/swagger-ui/index.html
```

## Pruebas

Ejecutar pruebas:

```bash
mvnw.cmd test
```

Generar reporte JaCoCo:

```bash
mvnw.cmd clean test
mvnw.cmd jacoco:report
```

Reporte generado en:

```text
target/site/jacoco/index.html
```

## Cobertura

Cobertura obtenida mediante JaCoCo: 78%.
