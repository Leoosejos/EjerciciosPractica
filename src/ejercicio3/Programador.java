package ejercicio3;


public class Programador extends Empleado {
    private int horasExtra;
    private double tarifaExtra;

    public Programador(String nombre, double salarioBase, int horasExtra, double tarifaExtra) {
        super(nombre, salarioBase);
        this.horasExtra = horasExtra;
        this.tarifaExtra = tarifaExtra;
    }

    @Override
    public double calcularSalarioFinal() {
        return salarioBase + (horasExtra * tarifaExtra);
    }

    // Getters y setters para horasExtra y tarifaExtra (opcional)
    public int getHorasExtra() {
        return horasExtra;
    }

    public double getTarifaExtra() {
        return tarifaExtra;
    }
}