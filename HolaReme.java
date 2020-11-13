/**
 * 
 */
package packageexperimento1;
import java.util.Scanner;
/**
 * @author Manolo Millón
 *
 */
public class HolaReme {

	/**
	 * Hoy nos hemos encontrado todo un grupo del colegio. He creado un pequeño programa para que mis compañeros adivinen el teléfono de Reme.
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("¿Dónde está Reme?");
		System.out.println("Encuentra a Reme y gana un gallifante. ");
		
		System.out.print("Por favor, introduce el número de Reme: ");
		double numero = teclado.nextDouble();
		double telefono;
		telefono = 666333999;
		
		
		if ((numero) == (telefono)) {
			System.out.println("Enhorabuena, has encontrado a Reme.");
		} else {
			System.out.println("Querido compañero del Ortega: Mala suerte, continúa buscando.");
		}
			
		}

	}


