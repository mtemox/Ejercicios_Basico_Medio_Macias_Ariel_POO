package Practica_2_Sobrecarga.Ejercicio_1;

public class Main {
    public static void main(String[] args) {
        // Creo un objeto Calculadora
        Calculadora calc = new Calculadora();

        int resultado1 = calc.sumar(4, 6);               // enteros
        double resultado2 = calc.sumar(3.5, 2.8);         // decimales
        int resultado3 = calc.sumar(1, 2, 3);             // tres enteros

        System.out.println("Suma de dos enteros: " + resultado1);
        System.out.println("Suma de dos decimales: " + resultado2);
        System.out.println("Suma de tres enteros: " + resultado3);
    }
}
