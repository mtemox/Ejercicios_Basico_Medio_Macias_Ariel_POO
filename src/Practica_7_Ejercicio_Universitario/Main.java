package Practica_7_Ejercicio_Universitario;

public class Main {
    public static void main(String[] args) {
        // Creo los objetos tipo Estudiante
        EstudianteBecado est1 = new EstudianteBecado("Luis", 20, "Sistemas", 9.2, "Académica");
        EstudianteBecado est2 = new EstudianteBecado("Ana", 19, "Derecho", 8.0, "Económica");

        est1.mostrarDatos();
        est1.aplicarDescuento();
        est2.aplicarDescuento();
    }
}
