package Practica_1_Encapsulamiento.Ejercicio_9;

public class CuentaBancaria {
    // Atributos de la clase
    private String titular = "";
    private double saldo = 0.0;
    // Metodo set para
    // Metodo set y get para titular
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public String getTitular() {
        return titular;
    }
    // Metodo set y get para saldo
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double getSaldo() {
        return saldo;
    }
}
