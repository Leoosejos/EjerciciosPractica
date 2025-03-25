package ejercicio51;

public class Multiplicacion extends OperacionMatematica {

    public Multiplicacion(double operando1, double operando2) {
        super(operando1, operando2);
    }

    @Override
    public double calcular() {
        return operando1 * operando2;
    }
}