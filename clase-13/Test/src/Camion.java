public class Camion extends Vehiculo{
    private int puertas;

    public Camion(String marca, String modelo, String anio, int cantRuedas, boolean telepase, int puertas) {
        super(marca, modelo, anio, cantRuedas, telepase);
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
        return "Camion{" +
                "puertas=" + puertas +
                '}';
    }
}
