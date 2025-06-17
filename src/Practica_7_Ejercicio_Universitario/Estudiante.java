package Practica_7_Ejercicio_Universitario;

public class Estudiante extends Persona {
    // Atributos de la clase
    private String carrera;
    private double promedio;
    // Metodo constructor
    public Estudiante(String nombre, int edad, String carrera, double promedio) {
        super(nombre, edad);
        this.carrera = carrera;
        this.promedio = promedio;
    }
    // Metodos de la clase
    // Metodo para saber si es apto para la beca
    public boolean esAptoBeca() {
        if (promedio >= 8.6) {
            return true;
        } else {
            return false;
        }
    }
    // Metodo get para promedio y carrera
    public double getPromedio() {
        return promedio;
    }
    public String getCarrera() {
        return carrera;
    }
    // Metodo sobreescrito para mostrar los datos
    @Override
    public void mostrarDatos() {
        System.out.println("--- Estudiante ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Carrera: " + carrera);
        System.out.println("Promedio: " + promedio);
    }
    // Sobrecarga de metodo inscribir():
    public void inscribir(String semestre) {
        System.out.println("Estudiante inscirto en el semestre: " + semestre);
    }
    public void inscribir(String semestre, String modalidad) {
        System.out.println("Estudiante inscirto en el semestre: " + semestre);
        System.out.println("Modalidad: " + modalidad);
    }
}
