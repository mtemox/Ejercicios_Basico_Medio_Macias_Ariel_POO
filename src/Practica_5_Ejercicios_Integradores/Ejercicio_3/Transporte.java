package Practica_5_Ejercicios_Integradores.Ejercicio_3;

public abstract class Transporte {
    protected String direccion;
    // Metodo abstracto
    public abstract void iniciarViaje();
    // Sobrecarga 1: solo dirección
    public void registrarRuta(String direccion) {
        if (direccion != null && !direccion.trim().isEmpty()) {
            this.direccion = direccion;
            System.out.println("Ruta registrada: " + direccion);
        } else {
            System.out.println("Error: dirección inválida");
        }
    }
    // Sobrecarga 2: dirección + hora
    public void registrarRuta(String direccion, String hora) {
        if (direccion != null && !direccion.trim().isEmpty()) {
            this.direccion = direccion;
            System.out.println("Ruta registrada: " + direccion + " a las " + hora);
        } else {
            System.out.println("Error: dirección inválida");
        }
    }
    // Metodo auxiliar simulado
    public void calcularDistancia(double velocidad, double tiempoHoras) {
        double distancia = velocidad * tiempoHoras;
        System.out.println("Distancia recorrida: " + distancia + " km");
    }
}
