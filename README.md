# README - Taller de Aplicaciones Móviles – Semana 3

Este proyecto corresponde a la actividad formativa de la Semana 3 del ramo Taller de Aplicaciones Móviles en AIEP. El objetivo es comprender el proceso de compilación y ejecución de programas Java sin utilizar un IDE, relacionando los lenguajes de programación con las máquinas virtuales, y documentando todo el proceso mediante GitHub.

## Requisitos

- Sistema operativo: Windows 11 ProJava Development Kit (JDK 8) instalado y configurado en el PATHSímbolo del sistema (CMD) para compilar y ejecutar los programasCuenta en GitHub para documentación y control de versiones

## Cómo compilar y ejecutar

1. Abrir CMD y moverse a la carpeta src: cd %USERPROFILE%\Desktop\TAM_Semana3\src2. Compilar los programas: javac VehiculoDatos.java javac NombreEdad.java3. Ejecutar los programas: java VehiculoDatos java NombreEdad

## Programas incluidos

- VehiculoDatos.java → solicita datos de un vehículo (marca, modelo, cilindrada, combustible, capacidad) y los muestra en pantalla.NombreEdad.java → solicita nombre y edad del usuario, mostrando luego la información ingresada.

## Requerimientos del proyecto

### Funcionales

- RF1: Registrar usuario mediante cuenta Gmail.RF2: Permitir compras con cálculo automático de despacho según reglas.RF3: Mostrar detalle de subtotal, despacho y total.

### No funcionales

- RNF1: Usabilidad con mensajes claros y simples.RNF2: Compatibilidad mínima: Android 10.RNF3: Seguridad en autenticación de usuario.

## Historias de usuario

- HU1: Como comprador, quiero registrarme con mi cuenta Gmail, para no tener que crear una nueva contraseña.HU2: Como cliente, quiero calcular el costo de despacho antes de confirmar la compra, para decidir si continuar.HU3: Como usuario, quiero visualizar el detalle de cobro en pantalla, para entender el valor del despacho.

## Cronograma inicial

| Tarea | Fecha límite |
| --- | --- |
| Instalación JDK y configuración PATH | 02-09-2025 |
| Creación de programas en Java | 03-09-2025 |
| Compilación y ejecución en CMD | 03-09-2025 |
| Documentación de código línea a línea | 04-09-2025 |
| Elaboración del informe final | 05-09-2025 |
| Subida de entregables a plataforma | 06-09-2025 |

## Evidencias

Las capturas del proceso (instalación, compilación, ejecución y repositorio) se encuentran en la carpeta docs/ de este repositorio.

## Bibliografía

Oracle. (s. f.). Java SE Development Kit 8 – Downloads. Oracle. Recuperado el 2 de septiembre de 2025, de https://www.oracle.com/cl/java/technologies/javase/javase-jdk8-downloads.htmlOracle. (s. f.). What is Java? Java.com. Recuperado el 2 de septiembre de 2025, de https://www.java.com/es/download/help/whatis_java.htmlKotlin Foundation. (s. f.). Kotlin command-line compiler. Kotlinlang.org. Recuperado el 2 de septiembre de 2025, de https://kotlinlang.org/docs/command-line.html