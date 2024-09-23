
public class Mascota {
	private String nombre;
	private String especie;
	private Duenio Duenio;
	public Mascota(String nombre, String especie, Duenio duenio) {
		super();
		this.nombre = nombre;
		this.especie = especie;
		Duenio = duenio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public Duenio getDuenio() {
		return Duenio;
	}
	public void setDuenio(Duenio duenio) {
		Duenio = duenio;
	}
	@Override
	public String toString() {
		return "Mascota [nombre=" + nombre + ", especie=" + especie + ", Duenio=" + Duenio + "]";
	}
	
	
	
}
