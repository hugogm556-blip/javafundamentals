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

//	Thread entranceUser1 = new Thread(new User(User));
//	entranceUser1.start();
//	
		Thread entranceUser1 = new Thread(new UserSearching(targetName, clients, 0, clients.length / 2));
		entranceUser1.start();

		Thread entranceUser2 = new Thread(new UserSearching(targetName, clients, clients.length / 2, clients.length ));
		entranceUser2.start();
		
		
	}
}
