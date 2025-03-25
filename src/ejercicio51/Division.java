package ejercicio51;

public class Division extends OperacionMatematica {

    public Division(double operando1, double operando2) {
        super(operando1, operando2);
    }

    @Override
    public double calcular() {
        if (operando2 == 0) {
            throw new ArithmeticException("Error: División por cero no permitida.");
        }
        return operando1 / operando2;
    }
}