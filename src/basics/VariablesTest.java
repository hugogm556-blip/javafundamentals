/**
 * 
 */
package basics;

/**
 * @author hugog24 oct 2025
 */

public class VariablesTest {
	boolean isRunning = false;

	public static void main(String[] args) {
		// una variable de tipo boolean ocupa un byte de espacio

		// tipo + nombre de variable = el valor concreto
		// variable local

		boolean isRunning = true;
		isRunning = false;
		// number0 = 23;

		// ocupa solo un byte en la memoria
		byte number0 = 25;// es lo mismo que short pero con menos espacio
		// una variable de tipo short ocupa 2 bytes
		short number1 = 23;// se usa para almacenar numeros enteros y tiene menos espacio que int
		// conversion de un tipo mayor a un tipo que ocupa menos espacio
		number0 = (byte) number1;
		System.out.println("number0 "+ number0);
		number1 = number0;
		
		int number2=324324234;
	}

	void stop() {

		isRunning = false;
	}

}
