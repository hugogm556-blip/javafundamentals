/**
 * 
 */
package threadsandparallelcalculation;

import java.util.Iterator;

/**
 * @author hugog16 sept 2025
 */

/*
 * tareas paralelas: en un aeropuerto, hay varias entradas, tenemos 
 * que registrar las salidas y entradas de todas las personas 
 */
public class EntranceRegistrationTask implements Runnable {
//  EntranceRegistrationTask es una clase que guarda airport
	
	/**
	 * @param airport
	 */
	private Airport airport;
		
	
	public EntranceRegistrationTask(Airport airport) {
		// TODO Auto-generated constructor stub
		this.airport = airport;
	}

	@Override
	public void run() {
		
		System.out.println("the task start");
		try {
			// esta funcion obtiene el nombre del hilo que se esta ejecutando e imprimir
			// current es actual
			System.out.println("the thread name is " + Thread.currentThread().getName());
			// hacer que este hilo duerma 2 segundos
			System.out.println("the thread " + Thread.currentThread().getName() + " has entered in sleep mode");
			Thread.sleep(2000);
			// decrease es el constructor de airport de decrecer
			// este bucle for sirve para que se repita el codigo que esta dentro 100 veces 
			// segun el bucle
			for (int i = 0; i <100; i++) {
				airport.increment();

			}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("the task end");

	}

}
