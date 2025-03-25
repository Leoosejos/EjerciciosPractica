package ejercicio27;

public class CuentaAhorro extends CuentaBancaria {
    private double saldoMinimo;

    public CuentaAhorro(String numeroCuenta, double saldo, double saldoMinimo) {
        super(numeroCuenta, saldo);
        this.saldoMinimo = saldoMinimo;
    }

    public double getSaldoMinimo() {
        return saldoMinimo;
    }

    @Override
    public boolean retirar(double monto) {
        if (monto > 0 && (saldo - monto) >= saldoMinimo) {
            saldo -= monto;
            return true;
        }
        System.out.println("Retiro no permitido. Debe mantenerse un saldo mínimo de " + saldoMinimo);
        return false;
    }

    @Override
    public String toString() {
        return "CuentaAhorro [numeroCuenta=" + numeroCuenta + ", saldo=" + saldo +
                ", saldoMinimo=" + saldoMinimo + "]";
    }
}