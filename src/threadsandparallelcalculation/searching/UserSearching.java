/**
 * 
 */
package threadsandparallelcalculation.searching;

import datastructure.User;

/**
 * @author hugog30 sept 2025
 */
public class UserSearching implements Runnable {
	String targetName;
	User[] clients;
	int begining;
	int end;
	/**
	 * 
	 */
	public UserSearching(String target, User[] clients,int begining,int end) {
		this.targetName= target;
		this.clients=clients;
		this.begining= begining;
		this.end = end;
		
	}
	public void run() {
		for (int i = begining ; i < end; i++) {
			if (clients[i].getName().equals(targetName)) {
				System.out.println(" El nombre ha sido encontrado " + clients[i].getName());
			}
		}

	}
}
