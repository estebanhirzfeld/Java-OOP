
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Cuenta c1 = new Cuenta("Tony");
        System.out.println(c1.getTitular());

        c1.setSaldo(-555);
        System.out.println("Saldo: " + c1.getSaldo());

        c1.setSaldo(555);
        System.out.println("Saldo: " + c1.getSaldo());

        c1.setTitular("");
        System.out.println("Nombre: " + c1.getTitular());

        c1.setTitular("12345678911234567890000");
        System.out.println("Nombre: " + c1.getTitular());

        c1.setTitular("Tony Montana");
        System.out.println("Nombre: " + c1.getTitular());

        Cuenta c2 = new Cuenta("Tom");

        System.out.println("Nombre: " + c2.getTitular());
    }
}