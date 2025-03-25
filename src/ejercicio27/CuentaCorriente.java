package ejercicio27;

public class CuentaCorriente extends CuentaBancaria {
    private double limiteCredito;

    public CuentaCorriente(String numeroCuenta, double saldo, double limiteCredito) {
        super(numeroCuenta, saldo);
        this.limiteCredito = limiteCredito;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    @Override
    public boolean retirar(double monto) {
        if (monto > 0 && (saldo - monto) >= -limiteCredito) {
            saldo -= monto;
            return true;
        }
        System.out.println("Retiro no permitido. Se excede el límite de crédito de " + limiteCredito);
        return false;
    }

    @Override
    public String toString() {
        return "CuentaCorriente [numeroCuenta=" + numeroCuenta + ", saldo=" + saldo +
                ", limiteCredito=" + limiteCredito + "]";
    }
}