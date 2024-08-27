public class Cuenta {
    private String titular;
    private double saldo;

    public Cuenta(String titular){
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        if (titular.trim().length() < 3 ){
            System.out.println("Nombre invalido, min 4 caracteres");
        } else if (titular.trim().length() > 20) {
            System.out.println("Nombre invalido, max 20 caracteres");
        } else {
            this.titular = titular;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo < 0 ){
            System.out.println("Saldo invalido");
        } else {
            this.saldo = saldo;
        }
    }

    public void saludo(){
        System.out.println("Hi I'm " + this.titular);
    }
}
