# Manipulación Gráfica con OpenJFX y FXML

Este proyecto es una aplicación de escritorio desarrollada en Java utilizando **OpenJFX** para la interfaz gráfica y **FXML** con Scene Builder para su diseño.  Forma parte de un proyecto de mi ciclo de DAM (Desarrollo de Aplicaciones Multiplataforma). El objetivo principal es visualizar y manipular propiedades gráficas de diferentes formas geométricas y líneas, útil para la comprensión de conceptos en el contexto de inventarios y control de stock. 

## Sobre el Proyecto

La aplicación simula un entorno de "control de stock" donde el usuario puede interactuar con elementos gráficos para observar cambios en tiempo real. Se enfoca en la manipulación de líneas y figuras geométricas, permitiendo ajustar su grosor, color, rotación y opacidad a través de una interfaz de usuario intuitiva. La separación entre la lógica de la aplicación y el diseño de la interfaz (gracias a FXML) facilita su mantenimiento y futuras modificaciones. 

## Características

* **Interfaz Gráfica:** Desarrollada con OpenJFX y diseñada con FXML y Scene Builder para una experiencia de usuario estructurada e intuitiva. 
* **Manipulación de Líneas:** Incluye tres líneas horizontales que pueden ser manipuladas individualmente. 
    * **Ajuste de Grosor:** Botones dedicados para aumentar y disminuir el grosor de cada línea. 
    * **Cambio de Color:** Botones para alternar entre colores (rojo, verde, azul) para cada línea. 
* **Figuras Geométricas Interactivas:**
    * **Formas Incluidas:** Un triángulo, un pentágono y un rectángulo. 
    * **Rotación:** Un botón "Rotar" que gira las tres figuras 90 grados en sentido horario. 
    * **Control de Opacidad:** Botones "Aumentar Opacidad" y "Disminuir Opacidad" para ajustar la transparencia de las figuras simultáneamente. 

## Tecnologías Utilizadas

* **Java:** Lenguaje de programación principal.
* **OpenJFX:** Framework para el desarrollo de interfaces gráficas de usuario.
* **FXML:** Lenguaje basado en XML para definir la interfaz de usuario de JavaFX.
* **Scene Builder:** Herramienta visual para diseñar interfaces FXML.
* **OpenJDK:** Entorno de ejecución de Java.

## Instalación y Uso

Para configurar y ejecutar este proyecto localmente, sigue estos pasos:

### 1. Requisitos Previos

* **JDK (OpenJDK):** Asegúrate de tener un JDK compatible con OpenJFX (por ejemplo, OpenJDK 11 o superior, o una versión que incluya los módulos de JavaFX).
* **Scene Builder:** Recomendado para abrir y editar el archivo `.fxml` del proyecto.
* **IDE:** Un entorno de desarrollo como IntelliJ IDEA, Eclipse o VS Code con soporte para JavaFX.

### 2. Configuración del Proyecto

1.  **Clonar el Repositorio:**
    ```bash
    git clone <URL_DE_TU_REPOSITORIO>
    cd Caso1_U1_PlazaCuadrosAntonioJose
    ```
2.  **Abrir en tu IDE:** Importa el proyecto en tu IDE preferido. Si usas Maven o Gradle, asegúrate de que las dependencias de OpenJFX estén configuradas correctamente en tu `pom.xml` o `build.gradle`.

    **Ejemplo de dependencia Maven (en `pom.xml`):**

    ```xml
    <dependencies>
        <dependency>
            <groupId>org.openjfx</groupId>
            <artifactId>javafx-controls</artifactId>
            <version>X.Y.Z</version> </dependency>
        <dependency>
            <groupId>org.openjfx</groupId>
            <artifactId>javafx-fxml</artifactId>
            <version>X.Y.Z</version> </dependency>
        </dependencies>
    ```

    Asegúrate de que la configuración de tu IDE apunte al JDK correcto y que los módulos de JavaFX estén incluidos o referenciados.

### 3. Ejecución de la Aplicación

1.  Localiza la clase principal que contiene el método `main` y extiende `javafx.application.Application`.
2.  Ejecuta la aplicación desde tu IDE.

La ventana de la aplicación de control de stock debería aparecer, mostrando las líneas y figuras interactivas.

## Estructura del Proyecto

El proyecto probablemente incluye:

* **Archivos `.fxml`:** Para el diseño de la interfaz de usuario.
* **Clases Controller:** Archivos Java que manejan la lógica de la interfaz y las interacciones del usuario.
* **Clase `App` (o similar):** La clase principal que inicia la aplicación JavaFX.
* **Clases de Modelos:** Clases que representan los datos o la lógica de negocio (en este caso, las propiedades de las figuras).

## Aprendizajes Clave

Durante el desarrollo de este proyecto, se han consolidado los siguientes conocimientos y habilidades:

* **Desarrollo de GUI con JavaFX:** Creación de interfaces gráficas interactivas.
* **Diseño de UI con FXML y Scene Builder:** Separación efectiva entre la lógica y la presentación.
* **Manipulación de Formas Gráficas (Shapes):** Control de propiedades como grosor, color, rotación y opacidad de elementos visuales.
* **Manejo de Eventos:** Implementación de acciones al interactuar con botones y otros controles.
* **Conceptos de Control de Stock:** Aunque simplificado, aplica la visualización de datos de inventario.

Este proyecto ha sido fundamental para comprender el desarrollo de aplicaciones de escritorio con JavaFX y la importancia de un diseño modular para interfaces de usuario.
