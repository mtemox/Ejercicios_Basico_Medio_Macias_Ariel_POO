package Practica_1_Encapsulamiento.Ejercicio_8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Creo un objeto Scanner para datos por teclado
        Scanner sc = new Scanner(System.in);
        // Creo un objeto
        Libro l1 = new Libro();
        // Accedo al metodo de Libro
        System.out.print("Ingrese el nombre del libro: ");
        String titulo = sc.nextLine();
        l1.setTitulo(titulo);
        System.out.print("Ingrese el año de publicación: ");
        int anioPublicacion  = sc.nextInt();
        l1.setAnioPublicacion(anioPublicacion);
        System.out.println("Nombre del libro: " + l1.getTitulo());
        System.out.println("Año de publicación: " + l1.getAnioPublicacion());
    }
}
