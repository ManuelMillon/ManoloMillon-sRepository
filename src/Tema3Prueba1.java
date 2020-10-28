import java.util.Scanner;
/*
 Tema 3. Lectura de datos desde teclado usando la clase Scanner
 */
package Tema3Prueba1;

/**
 *
 * @author Manuel Millón
 */
public class Tema3Prueba1 {

    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      System.out.print("Intruduce tu nombre y tu edad separados por un espacio: ");
      String nombre = s.next();
      int edad = s.nextInt();
      System.out.println("Te llamas " + nombre + " y tu edad es " + edad );
        
    }
    
}
