package Practica_1_Encapsulamiento.Ejercicio_10;

public class Main {
    public static void main(String[] args) {
        // Creo un objeto Empleado
        Empleado empleado = new Empleado();
        // Asignar valores a los atributos públicos directamente
        empleado.horario = "9:00 - 18:00";
        // Asignar valores a los atributos privados usando setters
        empleado.setNombre("Ariel");
        empleado.setSalario(460.00);
        // Mostrar la información
        empleado.mostrarDatos();
    }
}
