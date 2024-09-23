import java.time.LocalDate;
import java.time.LocalTime;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		int num=0;
		Duenio yo = new Duenio("Fabrizzio");
		
		Mascota nina = new Mascota("nina","Gato",yo);
		
		Turno nuevo = new Turno(LocalDate.now(),LocalTime.now(),1,"LELE pancha",nina);
		
		JOptionPane.showMessageDialog(null, nuevo.getMascota().getDuenio().getNombre());
		
		Veterinario vet = new Veterinario("Tony");

		vet.RealizarDiagnostico(nuevo, "Masomenos");
		vet.RealizarDiagnostico(nuevo, "Todo Bien");

		System.out.println(nuevo.toString());
	}
	
}
