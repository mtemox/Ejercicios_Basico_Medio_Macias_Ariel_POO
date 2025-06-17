package Practica_6_Herencia_Avanzada.Ejercicio_3;

public class Main {
    public static void main(String[] args) {
        Auto auto = new Auto("Toyota", "Yaris");
        Camion camion = new Camion(null, "Volvo FH");

        System.out.println();
        auto.mostrarInfo();

        System.out.println();
        camion.mostrarInfo();
    }
}
