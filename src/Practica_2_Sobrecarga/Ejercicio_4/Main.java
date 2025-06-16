package Practica_2_Sobrecarga.Ejercicio_4;

public class Main {
    public static void main(String[] args) {
        // Creo un objeto Agenda
        Agenda miAgenda = new Agenda();

        miAgenda.agregarContacto("Valentina");
        System.out.println();

        miAgenda.agregarContacto("Diego", "0991234567");
        System.out.println();

        miAgenda.agregarContacto("Lucía", "0987654321", "lucia@email.com");
    }
}
