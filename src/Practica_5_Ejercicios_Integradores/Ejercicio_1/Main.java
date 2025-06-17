package Practica_5_Ejercicios_Integradores.Ejercicio_1;

public class Main {
    public static void main(String[] args) {
        // Creo los objetos tipo Curso
        Curso curso1 = new CursoRegular("Java Básico", 100);
        Curso curso2 = new CursoCertificado("Java Avanzado", 150, 50);
        // Mostrar solo nombre
        curso1.mostrarInfo();
        // Mostrar nombre + costo calculado
        double costoCertificado = curso2.calcularCosto();
        curso2.mostrarInfo(costoCertificado);
        // Ver costos originales
        System.out.println("\nCosto original CursoRegular: " + curso1.calcularCosto());
        System.out.println("Costo original CursoCertificado: " + costoCertificado);
        // Calcular descuento si aplica
        System.out.println("\nCosto con descuento CursoRegular: " + curso1.calcularDescuento());
        System.out.println("Costo con descuento CursoCertificado: " + curso2.calcularDescuento());
    }
}
