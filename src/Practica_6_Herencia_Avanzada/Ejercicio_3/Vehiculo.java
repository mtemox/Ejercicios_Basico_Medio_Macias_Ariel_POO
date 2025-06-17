package Practica_6_Herencia_Avanzada.Ejercicio_3;

public abstract class Vehiculo {
    protected String marca;
    protected String modelo;

    public Vehiculo(String marca, String modelo) {
        if (marca != null && !marca.trim().isEmpty()) {
            this.marca = marca;
        } else {
            System.out.println("Error: marca no puede ser nula");
            this.marca = "Desconocida";
        }
        this.modelo = modelo;
    }

    public void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }

    public abstract void mostrarTipo();
}
