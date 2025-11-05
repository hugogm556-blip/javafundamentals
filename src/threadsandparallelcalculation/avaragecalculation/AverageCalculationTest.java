/**
 * 
 */
package threadsandparallelcalculation.avaragecalculation;

/**
 * @author hugog14 oct 2025
 */
public class AverageCalculationTest {
	public static void main(String[] args) {
		float[] numbers= new float [20000];
		/**
		 * primero se le tiene que dar valores a la lista 
		 * porque la lista esta ha 0 y no tiene nada y no se puede sumar porque no 
		 * hay ningun valor 
		 */
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = 0.1f;
		}
		int numOfThreads = Runtime.getRuntime().availableProcessors();
		int range = numbers.length / numOfThreads;
// sirve para calcular el rango de los hilos 
		for (int i = 0; i < numOfThreads; i++) {
			//i * range = inicio
			//i * range + range = final
			Thread entranceUser8 = new Thread(new SumAvarage(numbers, i * range, i * range + range));
			entranceUser8.start();
		}
		
		
	}
}
