// Importa la clase Scanner desde el paquete java.util
// Esto permite leer datos desde el teclado (entrada estándar)
import java.util.Scanner;

// Declaración de la clase pública NombreEdad
// "public" hace que pueda usarse desde cualquier parte
// "class" indica que estamos definiendo una clase
// El nombre "NombreEdad" debe coincidir con el archivo .java
public class NombreEdad {

// Método principal "main": punto de inicio del programa
// "public" lo hace accesible para la JVM
// "static" permite ejecutarlo sin crear un objeto de la clase
// "void" indica que no devuelve valores
// "String[] args" es un arreglo de cadenas que puede contener parámetros desde consola
public static void main(String[] args) {

    // Se crea un objeto Scanner llamado "sc"
    // "new Scanner(System.in)" especifica que leerá lo que se ingrese por teclado
    Scanner sc = new Scanner(System.in);

    // Solicita al usuario que ingrese su nombre
    // "System.out.print" imprime el mensaje sin salto de línea
    System.out.print("Ingrese su nombre: ");
    // "String" indica que la variable "nombre" guardará texto
    // "sc.nextLine()" lee lo que el usuario escribe hasta presionar Enter
    // ".trim()" elimina espacios en blanco al inicio y final
    String nombre = sc.nextLine().trim();

    // Solicita al usuario que ingrese su edad
    System.out.print("Ingrese su edad: ");
    // "int" indica que la variable "edad" guardará un número entero
    // "Integer.parseInt(...)" convierte el texto leído en un número entero
    int edad = Integer.parseInt(sc.nextLine().trim());

    // Muestra los datos ingresados por el usuario
    // "System.out.println" imprime con salto de línea
    // El símbolo "+" concatena texto con el valor de las variables
    System.out.println("Nombre ingresado: " + nombre);
    System.out.println("Edad ingresada: " + edad);

    // Cierra el objeto Scanner
    // Es una buena práctica liberar los recursos que ya no se usan
    sc.close();
} // Cierre del método main

} // Cierre de la clase NombreEdad