package Practica_3_Polimorfismo.Ejercicio_2;

public class Main {
    public static void main(String[] args) {
        // Arreglo de Vehiculo
        Vehiculo[] vehiculos = { new Moto(), new Carro() };
        // Creo un bucle para recorrer el arreglo
        for (Vehiculo vehiculo : vehiculos) {
            vehiculo.arrancar();
        }
    }
}
