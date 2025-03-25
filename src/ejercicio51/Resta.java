package ejercicio51;

public class Resta extends OperacionMatematica {

    public Resta(double operando1, double operando2) {
        super(operando1, operando2);
    }

    @Override
    public double calcular() {
        return operando1 - operando2;
    }
}