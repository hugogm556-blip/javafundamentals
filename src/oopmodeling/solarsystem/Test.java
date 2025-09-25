package oopmodeling.solarsystem;

public class Test {
	public static void main(String[] args) {
		Planet mercury = new Planet();
		Planet mars = new Planet(34);

		System.out.println(mercury.age);
		mars.doSomething();
		mars.doSomething();
		mercury.setAge(1000);
		/**
		 * los miembros estaticos de una clase se acceden 
		 * con el nombre de la clase, no los nombres de  los 
		 * objetos de la misma clase, porque los estaticos 
		 * no estan asociados con cualquier objeto especifico 
		 */
		
		Planet.doSomething();
		Planet.minimun_size = 234;
	}
}
