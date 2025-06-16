package Practica_2_Sobrecarga.Ejercicio_2;

public class Main {
    public static void main(String[] args) {
        // Creo un objeto Mensajero
        Mensajero m = new Mensajero();

        m.enviar("Hola");
        m.enviar("Hola", "Carlos");
        m.enviar("Hola", "Ana", 1);
    }
}
