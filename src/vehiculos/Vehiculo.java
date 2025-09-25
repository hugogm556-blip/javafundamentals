package vehiculos;

public class Vehiculo {
	int puertas;
	String color;
	int CV;

	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getCV() {
		return CV;
	}

	public void setCV(int cV) {
		CV = cV;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getRuedas() {
		return ruedas;
	}

	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}

	String tipo;
	String marca;
	String modelo;
	int ruedas;

	public Vehiculo(int puertas ,String color,int CV,String tipo,String marca, String modelo, int ruedas){
		
	}
	
	
}
