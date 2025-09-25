package vehiculos;

public class Coches extends Vehiculo {
	public Coches(int puertas, String color, int CV, String tipo, String marca, String modelo, int ruedas) {
		super(puertas, color, CV, tipo, marca, modelo, ruedas);
		// TODO Auto-generated constructor stub
	}

	boolean aireAcondicionado;
	boolean radio;
	boolean alfombrillas;
	boolean descapotable;

	public boolean isAireAcondicionado() {
		return aireAcondicionado;
	}

	public void setAireAcondicionado(boolean aireAcondicionado) {
		this.aireAcondicionado = aireAcondicionado;
	}

	public boolean isRadio() {
		return radio;
	}

	public void setRadio(boolean radio) {
		this.radio = radio;
	}

	public boolean isAlfombrillas() {
		return alfombrillas;
	}

	public void setAlfombrillas(boolean alfombrillas) {
		this.alfombrillas = alfombrillas;
	}

	public boolean isDescapotable() {
		return descapotable;
	}

	public void setDescapotable(boolean descapotable) {
		this.descapotable = descapotable;
	}

}
