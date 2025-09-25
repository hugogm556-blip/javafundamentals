package vehiculos;

public class Bicicleta extends Vehiculo {
	public Bicicleta(int puertas, String color, int CV, String tipo, String marca, String modelo, int ruedas) {
		super(puertas, color, CV, tipo, marca, modelo, ruedas);
		// TODO Auto-generated constructor stub
		this.marchas = marchas;
		this.cadena = cadena;
		this.timbre = timbre;
	}

	int marchas;

	public int getMarchas() {
		return marchas;
	}

	public void setMarchas(int marchas) {
		this.marchas = marchas;
	}

	public String getCadena() {
		return cadena;
	}

	public void setCadena(String cadena) {
		this.cadena = cadena;
	}

	public boolean isTimbre() {
		return timbre;
	}

	public void setTimbre(boolean timbre) {
		this.timbre = timbre;
	}

	String cadena;
	boolean timbre;

}
