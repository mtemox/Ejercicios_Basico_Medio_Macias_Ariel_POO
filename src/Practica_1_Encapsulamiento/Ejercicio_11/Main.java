package Practica_1_Encapsulamiento.Ejercicio_11;

public class Main {
    public static void main(String[] args) {
        // Creo un objeto Vehiculo
        Vehiculo vehiculo = new Vehiculo();
        // Asignar directamente los atributos públicos
        vehiculo.velocidadMaxima = 180;
        // Usar el setter para asignar la placa
        vehiculo.setPlaca("PCN-1234");
        // Mostrar la información del vehículo
        vehiculo.mostrarInfo();
    }
}
