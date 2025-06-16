package Practica_2_Sobrecarga.Ejercicio_3;

public class Persona {
    // Metodo 1: Solo nombre
    public void mostrar(String nombre) {
        System.out.println("Nombre: " + nombre);
    }
    // Metodo 2: Nombre y edad
    public void mostrar(String nombre, int edad) {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
    }
    // Metodo 3: Nombre, edad y ciudad
    public void mostrar(String nombre, int edad, String ciudad) {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Ciudad: " + ciudad);
    }
}
