package ejercicio75;

public class Freelancer implements Pagable {
    private double tarifaPorHora;
    private int horasTrabajadas;

    public Freelancer(double tarifaPorHora, int horasTrabajadas) {
        this.tarifaPorHora = tarifaPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularPago() {
        return tarifaPorHora * horasTrabajadas;
    }
}