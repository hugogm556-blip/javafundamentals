/**
 * 
 */
package threadsandparallelcalculation;

/**
 * @author hugog19 sept 2025
 */
public class ExitRegistrationTask implements Runnable {

	private Airport airport;

	/**
	 * @param airport
	 */
	public ExitRegistrationTask(Airport airport) {
		// TODO Auto-generated constructor stub
		this.airport = airport;
	}
	public void run() {
		
		System.out.println("the task start");
		try {
			// esta funcion obtiene el nombre del hilo que se esta ejecutando e imprimir
			// current es actual
			System.out.println("the thread name is " + Thread.currentThread().getName());
			// hacer que este hilo duerma 2 segundos
			
			System.out.println("the thread " + Thread.currentThread().getName()+"has entered in sleep mode" );
			Thread.sleep(2000);
			// decrease es el constructor de airport de decrecer
			// segun tantas veces el bucle
			for (int i = 0; i < 100; i++) {
				airport.decrease();
			}
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("the task end");

	}
	
	
}
