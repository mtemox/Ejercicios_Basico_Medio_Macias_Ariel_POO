package Practica_7_Ejercicio_Universitario;

public class EstudianteBecado extends Estudiante {
    // Atributos de la clase
    private String tipoBeca;
    // Metodo constructor
    public EstudianteBecado(String nombre, int edad, String carrera, double promedio, String tipoBeca) {
        super(nombre, edad, carrera, promedio);
        this.tipoBeca = tipoBeca;
    }
    // Metodo sobreescrito para mostrar los datos
    @Override
    public void mostrarDatos() {
        System.out.println("--- Estudiante Becado ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Carrera: " + getCarrera());
        System.out.println("Promedio: " + getPromedio());
        System.out.println("Tipo de beca: " + tipoBeca);
    }
    // Metodo aplicarDescuento():
    public void aplicarDescuento() {
        if ((tipoBeca == "Académica") && (getPromedio() >= 9)) {
            System.out.println("Aplica descuento del 50%");
        } else if (tipoBeca == "Económica") {
            System.out.println("Aplica descuento del 40%");
        } else {
            System.out.println("Aplica descuento del 30%");
        }
    }
}
