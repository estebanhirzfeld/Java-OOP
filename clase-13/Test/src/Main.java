import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		Auto palio = new Auto("Fiat","Palio","2004", true,2);

		Moto moto = new Moto("Honda", "RX150", "2020",true);

		System.out.println(moto.toString());
		
		JOptionPane.showMessageDialog(null, palio);
		
	}

}
