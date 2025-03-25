package ejercicio51;

public abstract class OperacionMatematica {
    protected double operando1;
    protected double operando2;


    public OperacionMatematica(double operando1, double operando2) {
        this.operando1 = operando1;
        this.operando2 = operando2;
    }

    public abstract double calcular();
}