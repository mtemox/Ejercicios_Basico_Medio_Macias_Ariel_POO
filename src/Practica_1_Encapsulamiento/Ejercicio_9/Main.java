package Practica_1_Encapsulamiento.Ejercicio_9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Creo un objeto Scanner para datos por teclado
        Scanner sc = new Scanner(System.in);
        // Creo un objeto
        CuentaBancaria c1 = new CuentaBancaria();
        // Accedo al metodo de Libro
        System.out.print("Ingrese el nombre del titular: ");
        String titular = sc.nextLine();
        c1.setTitular(titular);
        System.out.print("Ingrese el saldo: ");
        double saldo  = sc.nextDouble();
        c1.setSaldo(saldo);
        System.out.println("Nombre del titular: " + c1.getTitular());
        System.out.println("Saldo: " + c1.getSaldo());
    }
}
