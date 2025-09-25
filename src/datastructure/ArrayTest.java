package datastructure;

public class ArrayTest {
	public static void main(String[] args) {
		// ==args igualar un valor
		// establecer un valor a una variable
		System.out.println(1 == 1);
		int total = 0;
		int[] numbers = { 12, 123123, 435 };
		// sirve para sumar las posiciones 
		// int sum= numbers [0]+  numbers [1];
		// esta script sirve para sumar los numeros de una lista primero hacemos el bucle para que recorra la lista y lo registre en la variable 
		// total luego en la variable total y se va sumando en total primero la primera variable y luego la segunda variable y asi hasta la tercera
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("t = " + total);
			total =numbers[i] + total ;
			// numbers[i] sirve para recoger  
		}
		System.out.println(total);
		// array
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
}
