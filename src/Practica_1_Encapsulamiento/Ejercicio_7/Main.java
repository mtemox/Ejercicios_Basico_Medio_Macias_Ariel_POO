package Practica_1_Encapsulamiento.Ejercicio_7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Creo un objeto Scanner para datos por teclado
        Scanner sc = new Scanner(System.in);
        // Creo un objeto Producto
        Producto p1 = new Producto();
        // Accedo al metodo de Producto
        System.out.print("Ingrese el nombre del producto: ");
        String nombre = sc.nextLine();
        p1.setNombre(nombre);
        System.out.print("Ingrese el precio: ");
        double precio = sc.nextDouble();
        p1.setPrecio(precio);
        System.out.println("Nombre del producto: " + p1.getNombre());
        System.out.println("Precio del producto: " + p1.getPrecio());
    }
}
