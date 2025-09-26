/**
 * 
 */
package threadsandparallelcalculation.searching;

import datastructure.ArrayTest;
import datastructure.User;

/**
 * @author hugog26 sept 2025
 */
public class SearchingTest {
public static void main(String[] args) {
	/*
	 * 1 Crea un array de objetos de usuarios 
	 * 2 Usamos multiples hilos para encontrar un usuario concreto 
	 */
	User u;
	
//	Thread entranceUser1 = new Thread(new ArrayTest(User));
//	entranceUser1.start();
//	
//	Thread entranceUser2 = new Thread(new User());
//	entranceUser2.start();
	
	
	String targetName = "Manolo30";
	System.out.println("Manolo30" == targetName);
	User[] clients = new User[10];
	for (int i = 0; i < clients.length; i++) {
		// 0,1,2,3,
		// la i sirve para crear una variable y luego darle el valor 0
		clients[i] = new User(i, "aday" + i, true, "lolo" + i, 1.7f, "male" + i, 20);
	}
	
}
}
