import java.time.LocalDate;
import java.time.LocalTime;

public class Turno {
	private LocalDate fecha;
	private LocalTime hora;
	private int id;
	private String motivo;
	private String diagnostico;
	private Mascota mascota;
	public Turno(LocalDate fecha, LocalTime hora, int id, String motivo, Mascota mascota) {
		super();
		this.fecha = fecha;
		this.hora = hora;
		this.id = id;
		this.motivo = motivo;
		this.diagnostico = "No atendido";
		this.mascota = mascota;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public LocalTime getHora() {
		return hora;
	}
	public void setHora(LocalTime hora) {
		this.hora = hora;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMotivo() {
		return motivo;
	}
	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
	public String getDiagnostico() {
		return diagnostico;
	}
	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}
	public Mascota getMascota() {
		return mascota;
	}
	public void setMascota(Mascota mascota) {
		this.mascota = mascota;
	}
	@Override
	public String toString() {
		return "Turno [fecha=" + fecha + ", hora=" + hora + ", id=" + id + ", motivo=" + motivo + ", diagnostico="
				+ diagnostico + ", mascota=" + mascota + "]";
	}
	
	
}
