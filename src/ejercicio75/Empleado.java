package ejercicio75;

public class Empleado implements Pagable {
    private double salarioBase;
    private double horasExtra;
    private double tarifaHoraExtra;

    public Empleado(double salarioBase, double horasExtra, double tarifaHoraExtra) {
        this.salarioBase = salarioBase;
        this.horasExtra = horasExtra;
        this.tarifaHoraExtra = tarifaHoraExtra;
    }

    @Override
    public double calcularPago() {
        return salarioBase + (horasExtra * tarifaHoraExtra);
    }
}