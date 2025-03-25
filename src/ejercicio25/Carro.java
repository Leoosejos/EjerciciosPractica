package ejercicio25;

public class Carro extends Vehiculo {
    private int numeroDePuertas;

    public Carro(String marca, String modelo, int numeroDePuertas) {
        super(marca, modelo);
        this.numeroDePuertas = numeroDePuertas;
    }

    public int getNumeroDePuertas() {
        return numeroDePuertas;
    }

    public void setNumeroDePuertas(int numeroDePuertas) {
        this.numeroDePuertas = numeroDePuertas;
    }

    @Override
    public String toString() {
        return "Carro [" + super.toString() + ", numeroDePuertas=" + numeroDePuertas + "]";
    }
}