package Practica_6_Herencia_Avanzada.Ejercicio_3;

public class Auto extends Vehiculo {
    public Auto(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void mostrarTipo() {
        System.out.println("Vehículo liviano");
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        mostrarTipo();
    }
}
