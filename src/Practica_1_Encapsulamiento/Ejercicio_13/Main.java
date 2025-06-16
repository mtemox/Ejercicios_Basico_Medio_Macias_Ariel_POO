package Practica_1_Encapsulamiento.Ejercicio_13;

public class Main {
    public static void main(String[] args) {
        // Creo un objeto Pelicula
        Pelicula peli = new Pelicula();
        // Asignación directa a los atributos públicos
        peli.titulo = "El Viaje de Ariel";
        // Usar setters para los atributos privados
        peli.setDirector("Lucía Andrade");
        peli.setDuracion(115.5);
        // Mostrar la ficha técnica
        peli.mostrarFicha();
    }
}
