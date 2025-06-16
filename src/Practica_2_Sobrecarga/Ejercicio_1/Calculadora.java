package Practica_2_Sobrecarga.Ejercicio_1;

public class Calculadora {
    // Sumar dos enteros
    public int sumar(int a, int b) {
        return a + b;
    }
    // Sumar dos decimales
    public double sumar(double a, double b) {
        return a + b;
    }
    // Sumar tres enteros
    public int sumar(int a, int b, int c) {
        return a + b + c;
    }
}
