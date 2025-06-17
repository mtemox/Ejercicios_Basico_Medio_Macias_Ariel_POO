package Practica_6_Herencia_Avanzada.Ejercicio_1;

public class Main {
    public static void main(String[] args) {
        Gerente g1 = new Gerente("Luis", 40, 900, 100);
        System.out.println();
        Gerente g2 = new Gerente("Ana", 30, 700, 200);
        System.out.println();

        g1.mostrarInfo();
        System.out.println();
        g2.mostrarInfo();
    }
}
