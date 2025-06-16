package Practica_1_Encapsulamiento.Ejercicio_13;

public class Pelicula {
    // Atributos públicos
    public String titulo = "";
    public int anio = 2024;
    // Atributos privados
    private String director = "";
    private double duracion = 0.0;
    // Setters para los atributos privados
    public void setDirector(String director) {
        this.director = director;
    }
    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }
    // Metodo para mostrar la información de la película
    public void mostrarFicha() {
        System.out.println("Título: " + titulo);
        System.out.println("Año: " + anio);
        System.out.println("Director: " + director);
        System.out.println("Duración: " + duracion + " minutos");
    }
}

