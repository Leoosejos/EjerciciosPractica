package ejercicio3;


public class Gerente extends Empleado {
    private double bono;

    public Gerente(String nombre, double salarioBase, double bono) {
        super(nombre, salarioBase);
        this.bono = bono;
    }

    @Override
    public double calcularSalarioFinal() {
        return salarioBase + bono;
    }

    public double getBono() {
        return bono;
    }
}