# SprintMod7
# Gestor de Inscripción y Datos de Personas - Proyecto de Aplicación Web

Este proyecto consiste en el desarrollo de una aplicación web para gestionar las operaciones de un restaurante, incluyendo la atención a los comensales, el control de mesas, la toma de pedidos y la gestión de los garzones. La aplicación está construida en Java utilizando el framework Spring Boot y se comunica con una base de datos MySQL para el almacenamiento de la información.

## Requisitos del Proyecto

- Desarrollar una aplicación web utilizando Spring Boot para la gestión de un restaurante.
- Establecer la comunicación con una base de datos MySQL para almacenar la información relevante.
- Utilizar el patrón de diseño Modelo-Vista-Controlador (MVC) para una organización eficiente del código.
- Implementar controladores, servicios y repositorios para manejar las operaciones mencionadas.
- Proporcionar una API Rest para facilitar la interacción con la aplicación.
- Configurar la conexión a la base de datos utilizando JPA (Java Persistence API).
- Utilizar Thymeleaf o JSTL como motor de plantillas para renderizar las vistas HTML o JSP.
- Aplicar Bootstrap para el desarrollo de la interfaz de usuario.
- Crear vistas responsivas que se adapten a tres tamaños de pantalla distintos.

## Estructura del Proyecto

El proyecto se organiza siguiendo una estructura MVC, lo que facilita la separación de las diferentes capas y componentes. A continuación, se describen las principales carpetas y archivos:

- `src/main/java/com/restaurante`: Contiene los paquetes Java del proyecto.
  - `controller`: Aquí se encuentran los controladores que manejan las solicitudes HTTP y gestionan las respuestas.
  - `service`: Contiene los servicios que implementan la lógica de negocio de la aplicación.
  - `repository`: Define los repositorios que interactúan con la base de datos utilizando JPA.
  - `model`: Contiene las clases que representan los objetos de dominio de la aplicación.
- `src/main/resources`: Contiene los recursos de la aplicación.
  - `static`: Aquí se almacenan archivos estáticos como hojas de estilo, scripts, etc.
  - `templates`: Contiene las plantillas Thymeleaf o JSP para renderizar las vistas HTML.
  - `application.properties`: Archivo de configuración de Spring Boot, incluyendo la configuración de la base de datos.

## Instrucciones de Uso

1. Clona este repositorio en tu máquina local utilizando Git.
2. Configura la conexión a tu base de datos MySQL en `src/main/resources/application.properties`.
3. Importa el proyecto en tu entorno de desarrollo favorito (por ejemplo, IntelliJ IDEA o Eclipse).
4. Ejecuta la aplicación utilizando Spring Boot.
5. Accede a la aplicación en tu navegador web y explora las diferentes funcionalidades.
6. Loggin username= 'admin' password='hola1234'

## Autor

- Pedro Díaz Rivera :  https://github.com/pediazr/SprintMod7.git

