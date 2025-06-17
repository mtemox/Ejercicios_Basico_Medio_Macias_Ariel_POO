package Practica_4_Clase_Abstracta.Ejercicio_1;

public class Main {
    public static void main(String[] args) {
        // Creo los objetos de Cuadrado y Triangulo
        Figura cuadrado = new Cuadrado(4);
        Figura triangulo = new Triangulo(5, 3);
        // Llamo a los metodos
        System.out.println("Área del cuadrado: " + cuadrado.calcularArea());
        System.out.println("Área del triángulo: " + triangulo.calcularArea());
    }
}
