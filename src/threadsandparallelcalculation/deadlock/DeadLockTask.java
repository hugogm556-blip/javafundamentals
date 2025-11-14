/**
 * 
 */
package threadsandparallelcalculation.deadlock;

import java.time.Duration;

/**
 * @author hugog11 nov 2025
 */
/**
 *  como sucede el deadlock : 
 *  1 se genera en un entorno distribuido o concurrente
 *  2 se ocurre si tenemos multiples locks en el mismo contexto o entorno 
 *  3 cuando accedemos un recurso compartido protegido por multiples locks y empleamos los locks 
 *  en diferente orden
 *  
 * como solucionar deadlock: 
 * 
 * tenemos que emplear los locks siempre en
 * el mismo orden  en toda la aplicacion 


 */



public class DeadLockTask {
// cualquier instancia de una clase se puede usar como un lock para
	// proteger recursos compartidos
	Object lock1 = new Object();
	Object lock2 = new Object();
	Integer lock3 = 3;

	// el primer recurso protegido
	// protegido por lock1
	private float balance = 1;
	// el segundo recurso protegido
	// protegido por lock2

	private int stock = 10;

	public void task1() {
		synchronized (lock1) {
			System.out.println(
					"task1 protected by lock1 starts, the current thread name " + Thread.currentThread().getName());

			// otras operaciones ignoradas
			// examinar el almacen y reducir la cantidad
			if (stock <= 0) {
				return;
			}
			deductStcok();
			// una pausa
			try {
				Thread.sleep(Duration.ofMillis(100));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			synchronized (lock2) {
				System.out.println(
						"task1 protected by lock2 starts, the current thread name " + Thread.currentThread().getName());
				deduct();
				System.out.println("task1 protected by lock2 finished, the current thread name "
						+ Thread.currentThread().getName());
			}

			System.out.println(
					"task1 protected by lock1 finished, the current thread name " + Thread.currentThread().getName());
		}

	}

	public void task2() {
		synchronized (lock2) {
			System.out.println(
					"task1 protected by lock2 starts, the current thread name " + Thread.currentThread().getName());

			// otras operaciones ignoradas asociadas con esta tarea
			synchronized (lock1) {
				System.out.println(
						"task1 protected by lock1 starts, the current thread name " + Thread.currentThread().getName());
				deduct();
				System.out.println("task1 protected by lock1 finished, the current thread name "
						+ Thread.currentThread().getName());
			}
			System.out.println(
					"task1 protected by lock2 finished, the current thread name " + Thread.currentThread().getName());
		}
	}

	public void task3() {
		synchronized (lock2) {
			System.out.println("task3 start , the current thread name" + Thread.currentThread().getName());
			try {
				Thread.sleep(Duration.ofMillis(100));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("task3 finished , the current thread name" + Thread.currentThread().getName());

		}
	}

	public void task4() {

		System.out.println("task3 start , the current thread name" + Thread.currentThread().getName());
		try {
			Thread.sleep(Duration.ofMillis(100));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("task3 finished , the current thread name" + Thread.currentThread().getName());

	}

	private void deduct() {
		System.out.println("deduct balance");
		balance--;
	}

	private void deductStcok() {
		System.out.println("deduct stock");

		stock--;
	}

}
