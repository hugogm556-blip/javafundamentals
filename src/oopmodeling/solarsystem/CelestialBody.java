package oopmodeling.solarsystem;

public class CelestialBody {
	// se pueden acceder directamente desde cualquier sitio
	public float garvity = 55555555555555555.5555555555555555f;
	// los protegidos son visibles solo por sus descendientes 
	protected double mass = 44444444444444444444444.4f;
	
	// los miembros privados de una clase no pueden acceder fuera de la clase 
	
	private boolean hasOxygen = false;
	String name = "unknown ";
	float radius = 234234;
	int age = 3264346;
	public static float minimun_size=324534.6f;
	public float getGarvity() {
		return garvity;
	}

	public void setGarvity(float garvity) {
		this.garvity = garvity;
	}

	public double getMass() {
		return mass;
	}

	public void setMass(double mass) {
		this.mass = mass;
	}

	public boolean isHasOxygen() {
		return hasOxygen;
	}

	public void setHasOxygen(boolean hasOxygen) {
		this.hasOxygen = hasOxygen;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
  /**
   * los miembros estaticos tiene una copia para toda las clases porque es como 
   * tenr un minimo en todas las variables ese minimo siempre va a ser igual.
   * 
   * los miembros estaticos de una clase existen una sola copia en la memoria se cree cauntos
   * objetos se creen 
   */
	public static void doSomething() {
		// void devuelve vacio no devolver nada
		System.out.println("do something");
	}

}
