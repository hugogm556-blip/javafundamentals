/**
 * 
 */
package threadsandparallelcalculation.deadlock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author hugog11 nov 2025
 */
public class DeadLockTest {

	public static void main(String[] args) {
		// crear un objeto de clase @link{deadlocktask}
		DeadLockTask task = new DeadLockTask();
		// crear un objeto que nos administra un grupo de hilos reutilizables
		ExecutorService executor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		// () -> {}
		// entregamos las tareas a traves de "submit" para ejecutarlas en los hilos
		// pararelamente
//		for (int i = 0; i < 3; i++) {
//			executor.submit(() -> {
//
//				task.task4();
//				// task.task2();
//
//			});
//		}
//		for (int i = 0; i < 3; i++) {
//			executor.submit(() -> {
//
//				task.task3();
//				// task.task2();
//
//			});
//		}

		for (int i = 0; i < 2; i++) {
			executor.submit(() -> {

				task.task2();
				// task.task1();

			});
		}
		for (int i = 0; i < 2; i++) {
			executor.submit(() -> {

				task.task1();
				// task.task1();

			});
		}
		
		try {
			executor.awaitTermination(200, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
