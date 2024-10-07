
public class Auto extends Vehiculo{
	
	private int puertas;

	public Auto(String marca, String modelo, String anio,  boolean telepase, int puertas) {
		super(marca, modelo, anio, 4, telepase);
		this.puertas = puertas;
	}

	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	@Override
	public String toString() {
		return "Auto{" +
				"puertas=" + puertas +
				'}';
	}
}
