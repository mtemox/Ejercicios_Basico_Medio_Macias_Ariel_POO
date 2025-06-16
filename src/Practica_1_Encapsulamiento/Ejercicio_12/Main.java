package Practica_1_Encapsulamiento.Ejercicio_12;

public class Main {
    public static void main(String[] args) {
        // Creo un objeto Cliente
        Cliente cliente = new Cliente();
        // Asignar directamente los atributos públicos
        cliente.codigoCliente = 101;
        cliente.activo = true;
        // Usar los setters para asignar datos privados
        cliente.setNombre("Ariel");
        cliente.setTelefono("0998765432");
        // Mostrar los datos del cliente
        cliente.verCliente();
    }
}
