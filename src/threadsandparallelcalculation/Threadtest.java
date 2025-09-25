/**
 * 
 */
package threadsandparallelcalculation;

/**
 * @author hugog12 sept 2025
 */
public class Threadtest {
	public static void main(String[] args) {
		/**
		 * La entradade una aplicacion de java es 
		 * un hilo independiente
		 */

		/*
		 * lo que hace el thread es crear una variable que llama a la clase
		 * EntranceRegistrationTask y inicia lo que contiene. con el comando thread.start inicia la
		 * variable EntranceRegistrationTask
		 */
		
		
		Airport airport = new Airport();
		// creacion de un hilo y pasa la tarea al hilo
		
		
		//Thread thread1 = new Thread(new EntranceRegistrationTask(airport));
		//thread1.start();
		// Ejecuta la tarea que tiene el hilo
		

		Thread thread2 = new Thread(new EntranceRegistrationTask(airport));
		thread2.start();
		
		Thread thread3 = new Thread(new ExitRegistrationTask(airport));
		thread3.start();
		
		try {
			// hace que este hilo main duerma 4 segundos 
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("the people left in the airport " + airport.getCounter() + " has entered the sleep mode");
		System.out.println(Runtime.getRuntime().availableProcessors());
	}

}
