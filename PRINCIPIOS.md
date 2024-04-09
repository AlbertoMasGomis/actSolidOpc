# Principios que se incumplen en el ejercicio opcional:

## Principio de Responsabilidad Única (SRP):

### FileSystemBuilder:
- Este constructor tiene la responsabilidad de crear la estructura del sistema de archivos y de agregar archivos/directorios. Sin embargo, también se encarga de abrir, escribir y cerrar archivos, lo cual implica una violación de este principio. Se puede crear otra clase llamada 'FileHandler' para realizar estas tareas.

### FileSystemPrinter:
- Esta clase también tiene varias responsabilidades, ya que no solo imprime la estructura, sino que también calcula el tamaño de los archivos. Se puede separar esta funcionalidad en dos clases distintas, una dedicada exclusivamente a la impresión y otra al cálculo de tamaños.

## Principio de Segregación de Interfaces (ISP):

- La interfaz 'FileSystemItem' contiene métodos como open, close, setPosition, read y write, los cuales no son utilizados por todos los elementos. Sería conveniente separar estos métodos en varias interfaces distintas para evitar la implementación innecesaria de métodos en las clases que no los necesitan.

## Principio de Inversión de Dependencias (DIP):

- La clase FileSystemPrinter tiene una dependencia directa con 'FileManager', lo que reduce la flexibilidad de la clase. Se puede introducir una abstracción para que 'FileSystemPrinter' dependa de una interfaz llamada 'FileSystemManager' y luego implementarla en 'FileManager'.

