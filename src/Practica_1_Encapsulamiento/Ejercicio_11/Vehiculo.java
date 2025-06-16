package Practica_1_Encapsulamiento.Ejercicio_11;

public class Vehiculo {
    // Atributos públicos
    public String tipo = "Automóvil";
    public int velocidadMaxima;
    // Atributos privados
    private String placa = "";
    private String marca = "Toyota";
    // Setter para la placa
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    // Metodo para mostrar toda la información
    public void mostrarInfo() {
        System.out.println("Tipo: " + tipo);
        System.out.println("Velocidad Máxima: " + velocidadMaxima + " km/h");
        System.out.println("Placa: " + placa);
        System.out.println("Marca: " + marca);
    }
}

