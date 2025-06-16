package Practica_2_Sobrecarga.Ejercicio_4;

public class Agenda {
    // Metodo 1: Agregar solo nombre
    public void agregarContacto(String nombre) {
        System.out.println("Contacto agregado:");
        System.out.println("Nombre: " + nombre);
    }

    // Metodo 2: Agregar nombre y número
    public void agregarContacto(String nombre, String numero) {
        System.out.println("Contacto agregado:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Número: " + numero);
    }

    // Metodo 3: Agregar nombre, número y correo
    public void agregarContacto(String nombre, String numero, String correo) {
        System.out.println("Contacto agregado:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Número: " + numero);
        System.out.println("Correo: " + correo);
    }
}
