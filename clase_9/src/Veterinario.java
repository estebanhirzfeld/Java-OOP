
public class Veterinario {
	private String nombre;

	public Veterinario(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Veterinario [nombre=" + nombre + "]";
	}
	
	public void RealizarDiagnostico(Turno turno, String nuevo_diagnostico) {

		String diagnostico_actual = turno.getDiagnostico();

		turno.setDiagnostico(diagnostico_actual + "\n" + nuevo_diagnostico);
	}
}
