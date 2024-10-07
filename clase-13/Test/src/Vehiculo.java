
public class Vehiculo {
	private String marca;
	private String modelo;
	private String anio;
	private int cantRuedas;
	private boolean telepase;
	public Vehiculo(String marca, String modelo, String anio, int cantRuedas, boolean telepase) {
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
		this.cantRuedas = cantRuedas;
		this.telepase = telepase;
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
	public String getAnio() {
		return anio;
	}
	public void setAnio(String anio) {
		this.anio = anio;
	}
	public int getCantRuedas() {
		return cantRuedas;
	}
	public void setCantRuedas(int cantRuedas) {
		this.cantRuedas = cantRuedas;
	}
	public boolean isTelepase() {
		return telepase;
	}
	public void setTelepase(boolean telepase) {
		this.telepase = telepase;
	}

	@Override
	public String toString() {
		return "Vehiculo{" +
				"marca='" + marca + '\'' +
				", modelo='" + modelo + '\'' +
				", anio='" + anio + '\'' +
				", cantRuedas=" + cantRuedas +
				", telepase=" + telepase +
				'}';
	}
}
