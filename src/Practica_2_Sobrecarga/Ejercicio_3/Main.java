package Practica_2_Sobrecarga.Ejercicio_3;

public class Main {
    public static void main(String[] args) {
        // Creo un objeto Persona
        Persona persona = new Persona();

        persona.mostrar("Ariel");
        System.out.println(); // Separador visual

        persona.mostrar("Ariel", 19);
        System.out.println(); // Separador visual

        persona.mostrar("Ariel", 19, "Quito");
    }
}
