package Practica_6_Herencia_Avanzada.Ejercicio_2;

public class CuentaAhorros extends CuentaBancaria {
    private double interesMensual;

    public CuentaAhorros(String numeroCuenta, double saldo, double interesMensual) {
        super(numeroCuenta, saldo);
        this.interesMensual = interesMensual;
    }

    public void aplicarInteres() {
        saldo += saldo * (interesMensual / 100);
    }

    @Override
    public void mostrarDatos() {
        aplicarInteres();
        System.out.println("Cuenta de ahorros:");
        super.mostrarDatos();
    }
}
