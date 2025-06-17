package Practica_4_Clase_Abstracta.Ejercicio_4;

public class Main {
    public static void main(String[] args) {
        // Creo un objeto Persona
        Persona persona = new Persona();
        // Llamo al metodo para verificar la validacion de la edad
        persona.setEdad(25);
        persona.setEdad(-3);
        persona.mostrarEdad();
    }
}
