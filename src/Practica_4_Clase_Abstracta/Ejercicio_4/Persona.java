package Practica_4_Clase_Abstracta.Ejercicio_4;

public class Persona {
    // Atributos privados de la clase
    private int edad;
    // Metodo set para edad
    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
            System.out.println("Edad actualizada con éxisto.");
        } else {
            System.out.println("Edad inválida, no actualizada.");
        }
    }
    public void mostrarEdad() {
        System.out.println("Edad: " + edad);
    }
}
