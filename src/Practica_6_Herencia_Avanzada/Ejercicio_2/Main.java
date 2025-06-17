package Practica_6_Herencia_Avanzada.Ejercicio_2;

public class Main {
    public static void main(String[] args) {
        CuentaAhorros ahorro = new CuentaAhorros("001A", 1000, 2);
        CuentaCorriente corriente = new CuentaCorriente("", 500, 200);  // Número inválido

        System.out.println();
        ahorro.mostrarDatos();

        System.out.println();
        corriente.mostrarDatos();
    }
}
