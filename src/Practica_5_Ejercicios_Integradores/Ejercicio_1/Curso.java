package Practica_5_Ejercicios_Integradores.Ejercicio_1;

public abstract class Curso {
    // Atributo de la clase abstracta
    protected String nombre;
    // Validacion del nombre
    public Curso(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("Error: El nombre del curso no puede estar vacío.");
            this.nombre = "Sin nombre";
        }
    }
    // Metodo abstracto
    public abstract double calcularCosto();
    // Metodo sobrecargado 1: solo nombre
    public void mostrarInfo() {
        System.out.println("Curso: " + nombre);
    }
    // Metodo sobrecargado 2: nombre + costo
    public void mostrarInfo(double costo) {
        System.out.println("Curso: " + nombre);
        System.out.println("Costo: $" + costo);
    }
    // Metodo común: aplicar descuento del 10% si el costo > 150
    public double calcularDescuento() {
        double costo = calcularCosto();
        if (costo > 150) {
            return costo * 0.9;
        } else {
            return costo;
        }
    }
}
