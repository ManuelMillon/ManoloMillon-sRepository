/**
 * 
 */
package packageexperimento1;
import java.util.Scanner;
/**
 * @author Manolo Mill�n
 *
 */
public class HolaReme {

	/**
	 * Hoy nos hemos encontrado todo un grupo del colegio.
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("�D�nde est� Reme?");
		System.out.println("Encuentra a Reme y gana un gallifante. ");
		
		System.out.print("Por favor, introduce el n�mero de Reme: ");
		double numero = teclado.nextDouble();
		double telefono;
		telefono = 666333999;
		
		
		if ((numero) == (telefono)) {
			System.out.println("Enhorabuena, has encontrado a Reme.");
		} else {
			System.out.println("Querido compa�ero del Ortega: Mala suerte, contin�a buscando.");
		}
			
		}

	}


