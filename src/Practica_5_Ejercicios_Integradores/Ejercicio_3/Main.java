package Practica_5_Ejercicios_Integradores.Ejercicio_3;

public class Main {
    public static void main(String[] args) {
        Taxi taxi = new Taxi();
        Patineta patineta = new Patineta();
        // Registro de rutas y viaje para Taxi
        taxi.registrarRuta("Av. Quito", "08:00");
        taxi.iniciarViaje();
        taxi.calcularDistancia(60, 1);

        System.out.println();

        // Registro de rutas y viaje para Patineta
        patineta.registrarRuta("Parque Central");
        patineta.iniciarViaje();
        patineta.calcularDistancia(15, 0.5);

        System.out.println();

        // Prueba con dirección vacía
        taxi.registrarRuta("", "08:00");
    }
}
