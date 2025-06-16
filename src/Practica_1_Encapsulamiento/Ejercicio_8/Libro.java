package Practica_1_Encapsulamiento.Ejercicio_8;

public class Libro {
    // Atributos de la clase
    private String titulo = "";
    private int anioPublicacion = 0;
    // Metodo set y get para titulo
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getTitulo() {
        return titulo;
    }
    // Metodo set y get para anioPublicacion
    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
    public int getAnioPublicacion() {
        return anioPublicacion;
    }
}
