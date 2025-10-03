/**
 * 
 */
package threadsandparallelcalculation.searching;

import datastructure.User;

/**
 * @author hugog26 sept 2025
 */
public class SearchingTest {
	public static void main(String[] args) {
		/*
		 * 1 Crea un array de objetos de usuarios 2 Usamos multiples hilos para
		 * encontrar un usuario concreto
		 */
		String targetName = "aday40000";

		User[] clients = new User[1000000];
		for (int i = 0; i < clients.length; i++) {
			// 0,1,2,3,
			// la i sirve para crear una variable y luego darle el valor 0
			clients[i] = new User(i, "aday" + i, true, "lolo" + i, 1.7f, "male" + i, 20);
		}
		// int index = clients.length / 4;
//	Thread entranceUser1 = new Thread(new User(User));
//	entranceUser1.start();
// crear hilos pasando a cada hilo una tarea 
		// si se hace varios hilos primero se queda en 0 y luego 1 porque hay una
		// diferencia de 1 entre 0 y
		// ygual que 1 y 2 porque hay diferencia de 1 y no sean iguales
//		Thread entranceUser1 = new Thread(new UserSearching(targetName, clients, 0 *index , 1* index));
//		entranceUser1.start();
//// lanzar las tareas de los hilos 
//		Thread entranceUser2 = new Thread(new UserSearching(targetName, clients, 1* index, 2 * index));
//		entranceUser2.start();
//
//		Thread entranceUser3 = new Thread(new UserSearching(targetName, clients, 2 * index, 3 * index));
//		entranceUser3.start();
//
//		Thread entranceUser4 = new Thread(new UserSearching(targetName, clients, 3 * index, 4 * index));
//		entranceUser4.start();
		// se hace index + index para que index no sea igual y sea index index y el otro
		// index

		int numOfThreads = Runtime.getRuntime().availableProcessors();
		int index = clients.length / numOfThreads;

		for (int i = 0; i < numOfThreads; i++) {
			Thread entranceUser8 = new Thread(new UserSearching(targetName, clients, i * index, i * index + index));
			entranceUser8.start();
		}
	}
}
