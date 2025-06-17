package Practica_6_Herencia_Avanzada.Ejercicio_2;

public class CuentaBancaria {
    protected String numeroCuenta;
    protected double saldo;

    public CuentaBancaria(String numeroCuenta, double saldo) {
        if (numeroCuenta != null && !numeroCuenta.trim().isEmpty()) {
            this.numeroCuenta = numeroCuenta;
            this.saldo = saldo;
        } else {
            System.out.println("Error: Número de cuenta inválido");
            this.numeroCuenta = "Sin número";
            this.saldo = 0;
        }
    }

    public void mostrarDatos() {
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("Saldo actual: $" + saldo);
    }
}
