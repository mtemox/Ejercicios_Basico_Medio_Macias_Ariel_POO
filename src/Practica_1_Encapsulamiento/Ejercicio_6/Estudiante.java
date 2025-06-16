package Practica_1_Encapsulamiento.Ejercicio_6;

public class Estudiante {
    // Atributos de la clase
    private String nombre = "";
    private String carrera = "";
    // Metodo set para nombre y carrera
    public void setNombre(String nombre) {
        this.nombre=nombre;
    }
    public void setCarrera(String carrera) {
        this.carrera=carrera;
    }
    // Metodo get para nombre y carrera
    public String getNombre() {
        return nombre;
    }
    public String getCarrera() {
        return carrera;
    }
}
