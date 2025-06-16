package Practica_1_Encapsulamiento.Ejercicio_7;

public class Producto {
    // Atributos de la clase
    private String nombre = "";
    private double precio = 0.00;
    // Metodo set y get para nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    // Metodo set y get para precio
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public double getPrecio() {
        return precio;
    }
}

