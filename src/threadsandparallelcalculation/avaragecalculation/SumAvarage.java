/**
 * 
 */
package threadsandparallelcalculation.avaragecalculation;

import java.util.Arrays;

/**
 * @author hugog14 oct 2025
 */
/*
 * creamos un constructor para poder llamar las variables de averege 
 */
public class SumAvarage implements Runnable {
	private final float[] numbers;
	private final int begining;
	private final int end;
	
	public SumAvarage(float[] numbers, int i, int j) {
		this.numbers = numbers;
		this.begining=i;
		this.end=j;
	}

	@Override
	public void run() {
		/**
		 * aqui se crea una variable donde se guarda el resultado final de la lista con
		 * los valores ya añadidos
		 */
		System.out.println(Arrays.toString(numbers));
		float sum = 0;
		for (int i = begining; i <end; i++) {
			sum = numbers[i] + sum;
		}
		/**
		 * calcular el promedio de un array de tipo float empleado computacion paralela
		 * con multiples hilos
		 */
		System.out.println(sum);
		float Average = sum / numbers.length;
		System.out.println(Average);
	}

}
