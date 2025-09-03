import java.util.Scanner;  // Importa la clase Scanner desde el paquete java.util para leer datos desde el teclado

// Declaración de la clase pública VehiculoDatos
// "public" significa que puede usarse desde cualquier parte
// "class" indica que estamos definiendo una clase
// El nombre "VehiculoDatos" debe coincidir con el nombre del archivo .java
public class VehiculoDatos {  

 // Método principal "main": punto de entrada del programa
 // "public" permite que la JVM lo llame desde cualquier parte
 // "static" significa que pertenece a la clase y no a un objeto
 // "void" indica que no devuelve valores
 // "String[] args" es un arreglo de textos con parámetros que podrían pasarse al ejecutar el programa
    public static void main(String[] args) {  

  // Se crea un objeto Scanner llamado "sc"
  // "new Scanner(System.in)" indica que leerá la entrada estándar (teclado)
  Scanner sc = new Scanner(System.in);  

  // Muestra un mensaje sin salto de línea para pedir la marca
     System.out.print("Ingrese la marca: ");
  // Declara una variable tipo String llamada "marca"
  // "sc.nextLine()" lee todo el texto ingresado por el usuario
  // ".trim()" elimina espacios en blanco al inicio y al final
        String marca = sc.nextLine().trim();  

   // Pide y guarda el modelo
   System.out.print("Ingrese el modelo: ");
   String modelo = sc.nextLine().trim();  

   // Pide la cilindrada
   System.out.print("Ingrese la cilindrada (en cc): ");
   // "int" es un número entero
   // "Integer.parseInt(...)" convierte el texto leído a número entero
   int cilindrada = Integer.parseInt(sc.nextLine().trim());  

   // Pide el tipo de combustible
   System.out.print("Ingrese el tipo de combustible: ");
   String combustible = sc.nextLine().trim();  

   // Pide la capacidad de pasajeros
   System.out.print("Ingrese la capacidad en pasajeros: ");
   int capacidad = Integer.parseInt(sc.nextLine().trim());  

   // Muestra todos los datos ingresados
   // "System.out.println" imprime el texto y hace salto de línea
   // El operador "+" concatena (une) texto con variables
    System.out.println("La marca que ha ingresado es: " + marca);
    System.out.println("El modelo que ha ingresado es: " + modelo);
    System.out.println("La cilindrada que ha ingresado es: " + cilindrada);
    System.out.println("El tipo de combustible es: " + combustible);
    System.out.println("Tiene una capacidad de " + capacidad + " pasajeros.");

   // Cierra el objeto Scanner
   // se cierran recursos para liberar memoria
     sc.close();  
    } // Cierre del método main
} // Cierre de la clase VehiculoDatos