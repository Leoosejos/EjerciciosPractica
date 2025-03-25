package ejercicio51;

public class Suma extends OperacionMatematica {

    public Suma(double operando1, double operando2) {
        super(operando1, operando2);
    }

    @Override
    public double calcular() {
        return operando1 + operando2;
    }
}