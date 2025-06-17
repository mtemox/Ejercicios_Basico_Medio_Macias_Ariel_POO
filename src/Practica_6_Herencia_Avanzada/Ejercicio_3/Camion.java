package Practica_6_Herencia_Avanzada.Ejercicio_3;

public class Camion extends Vehiculo {
    public Camion(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void mostrarTipo() {
        System.out.println("Vehículo pesado");
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        mostrarTipo();
    }
}
