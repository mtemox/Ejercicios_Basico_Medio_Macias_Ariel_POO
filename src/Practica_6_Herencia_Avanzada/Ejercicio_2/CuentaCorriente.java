package Practica_6_Herencia_Avanzada.Ejercicio_2;

public class CuentaCorriente extends CuentaBancaria {
    private double sobregiroPermitido;

    public CuentaCorriente(String numeroCuenta, double saldo, double sobregiroPermitido) {
        super(numeroCuenta, saldo);
        this.sobregiroPermitido = sobregiroPermitido;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Cuenta corriente:");
        super.mostrarDatos();
        System.out.println("Sobregiro permitido: $" + sobregiroPermitido);
    }
}
