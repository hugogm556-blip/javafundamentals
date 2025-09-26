package datastructure;

import java.util.Iterator;

public class ArrayTest {
	public static void main(String[] args) {
		// ==args igualar un valor
		// establecer un valor a una variable
		System.out.println(1 == 1);

		int[] numbers = { 12, 123123, 435 };

		// array
		sumup(numbers);
		findMaxMix(numbers);
		// crea dos objetos de usuario
		User[] clients = new User[10];
		// tiene capacidad de guardar 20000 usuarios
		clients[0] = new User(23, "alejandroide", false, "loro", 1.5f, "male", 21);
		clients[1] = new User(24, "aday", true, "lolo", 1.7f, "male", 20);

		System.out.println(numbers.length);

		// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 2
		// out of bounds for length 2
		// at
		// javafundamentals/datastructure.ArrayTest.main(ArrayTest.java:23)
		// System.out.println(users[2]);
		System.out.println(clients.length);
		System.out.println("the lenght of the array clients " + clients.length);

		for (int i = 0; i < clients.length; i++) {
			// 0,1,2,3,
			// la i sirve para crear una variable y luego darle el valor 0
			clients[i] = new User(i, "aday" + i, true, "lolo" + i, 1.7f, "male" + i, 20);
		}

		for (int i = 0; i < clients.length; i++) {
			clients[i].getName();
			System.out.println(clients[i].getName());
			// la variable i no se puede sacar de los corchetes porque no lo leen
		}
		boolean[] booleans = null;
		System.out.println(booleans.length);
		User[] users = { new User(), new User(24, "aday", true, "lolo", 1.7f, "male", 20) };
		System.out.println(users.length);
		System.out.println(users[2]);

	}

	/**
	 * find the maximun and minimun value in the array
	 * @param numbers
	 */
	private static void findMaxMix(int[] numbers) {
		// TODO Auto-generated method stub
		int max= numbers [0];
		int min= numbers [numbers.length -1]; 
	
		for (int i = 0; i < numbers.length ; i++) {
			// si max es mayor que dato actual que hemos cogido 
			// numero[i]
			/*
			 * si max es mmenor que el numbers[i] ser cambia el numero mayor 
			 * de numbers a el maximo numero 
			 */
			if (min > numbers[i]) {
				min = numbers[i];
				System.out.println("el min es " + min); 
			}
			if (max < numbers[i]) {
				max = numbers[i];
				System.out.println("el max es " + max);
				
		
			}
		}
	
	}

	/**
	 * @param numbers
	 * 
	 */
	private static void sumup(int[] numbers) {

		int total = 0;
		// sirve para sumar las posiciones
		int sum = numbers[0] + numbers[1];
		// esta script sirve para sumar los numeros de una lista primero hacemos el
		// bucle para que recorra la lista y lo registre en la variable
		// total luego en la variable total y se va sumando en total primero la primera
		// variable y luego la segunda variable y asi hasta la tercera
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("t = " + total);
			total = numbers[i] + total;
			// numbers[i] sirve para recoger
		}
		System.out.println(total);
	}
}
