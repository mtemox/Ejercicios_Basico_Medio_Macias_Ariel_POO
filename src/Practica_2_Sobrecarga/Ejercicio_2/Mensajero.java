package Practica_2_Sobrecarga.Ejercicio_2;

public class Mensajero {
    // Metodo 1: Solo texto
    public void enviar(String texto) {
        System.out.println("Mensaje: " + texto);
    }
    // Metodo 2: Texto + destinatario
    public void enviar(String texto, String destinatario) {
        System.out.println("Mensaje para " + destinatario + ": " + texto);
    }
    // Metodo 3: Texto + destinatario + prioridad
    public void enviar(String texto, String destinatario, int prioridad) {
        System.out.println("Mensaje para " + destinatario + ": " + texto + " (Prioridad: " + prioridad + ")");
    }
}
