/**
 * 
 */
package threadsandparallelcalculation;

/**
 * @author hugog16 sept 2025
 */
public class Airport {
	private int counter = 0;
	
	
	
	// void te devuelve vacio
	/*
	 * qo que hace con la palabra clase " syncronized" es 
	 * hacer que el acceso del codigo envuelto con la palabra 
	 * se secuencia:
	 * por ejemplo, el codigo "counter = counter + 1;" se ejecuta
	 * por mas de un hilo  por miles de veces, cada vez  se puede ejecutar
	 * por un solo hilo desde su comienzo hasta el final 
	 *  
	 * hilo 1 -> counter = counter+ 1
	 * hilo 1 -> counter = counter+ 1
	 * hilo 2 -> counter = counter+ 1
	 * hilo 2 -> counter = counter+ 1	
	 * hilo 2 -> counter = counter+ 1
	 * 
	 */
	public synchronized void increment() {
		// incremento del valor de la variable de counter por 1
		/*
		 * counter ++ 
		 * cunter = counter + 1 
		 * los dos comandos son iguales
		 * CPU central processing unit
		 * paso 1 : leer el valor actual de la variable "counter",
		 * la mete en la memoria 
		 
		 * paso2: hacer la suma con el valor actual de " counter" con 1
		 * paso3 : actualizar el valor  guardado en la variable con el valor nuevo
		 */
		counter++;
	}

	public  void decrease() {
		// reducir el valor de la variable de counter por 1
		/*
		 * candado o llave, en ingles lock
		 * cualquier hilo para poder acceder a un trozo de codigo
		 * sincronizando, tiene que obtener primero un candado para
		 * el acceso, al obtener el  candado ningun otro puede ácceder 
		 * el mismo codigo hasta que el hilo que ocupa el candado lo haya libera .
		 * En este caso el candado es el objeto de airport que hemos creado 
		 * 
		 */
		synchronized (this) {
			counter--;	
		}
		
	}
	// get counter sirve para recoger informacion 
	public int getCounter() {
		return counter;
		
	}

}
