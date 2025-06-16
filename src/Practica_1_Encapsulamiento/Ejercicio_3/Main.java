package Practica_1_Encapsulamiento.Ejercicio_3;

public class Main {
    public static void main(String[] args) {
        // Creo un objeto Persona
        Persona p1 = new Persona();
        // Accedo al metodo de Persona
        p1.setEdad(19);
        System.out.print("Edad de la persona: " + p1.getEdad());
    }
}
