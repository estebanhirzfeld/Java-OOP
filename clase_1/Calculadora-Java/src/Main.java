import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		
		String[] opciones = {"Sumar","Restar","Division","Potencia", "Salir"};
		int opcion;
//		String elegido = (String)JOptionPane.showInputDialog(null,
//				"Mensaje de ventana",
//				"Titulo", 0, null, opciones, opciones[1]);

		do {
			opcion= JOptionPane.showOptionDialog(null,
					"La calculadora", "Hola", 0, 1,
					null, opciones, opciones[0]);

			if (opcion == opciones.length - 1){
				System.out.println("Chau lelo");
				break;
			}

			int x = input("Numero 1");
			int y = input("Numero 2");

			switch (opcion) {
				case 0:
				JOptionPane.showMessageDialog(null, "Suma " + suma(x,y));
				break;
			case 1:
				JOptionPane.showMessageDialog(null, "Resta " + resta(x,y));
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "Division " + dividir(x,y));
			break;
			case 3:
				JOptionPane.showMessageDialog(null, "Potencia " + potencia(x,y));
				break;
			}
		} while (opcion != opciones.length - 1);
	}

	public static int suma(int x, int y) {
		int resultado = x+y;
		return resultado;
	}
	public static int resta(int x, int y) {
		int resultado = x-y;
		return resultado;
	}

	public static int dividir(int x, int y) {
		int resultado = x/y;
		return resultado;
	}

	public static int potencia(int x, int y) {
		int resultado = 1;
		for (int i = 0; i < y; i++){
			resultado *= x;
		}
		return resultado;
	}

	public static int input(String msg) {
		return Integer.parseInt(JOptionPane.showInputDialog(null,msg));
	}
}
