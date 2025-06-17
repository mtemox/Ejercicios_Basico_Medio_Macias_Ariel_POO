package Practica_4_Clase_Abstracta.Ejercicio_1;

public class Cuadrado extends Figura {
    // Atributo privado
    private double lado;
    // Metodo de verificacion
    public Cuadrado(double lado) {
        if (lado > 0) {
            this.lado = lado;
        } else {
            System.out.print("El lado debe ser positivo, por defecto se asigna 1.");
            this.lado = 1;
        }
    }
    // Modificacion del metodo abstracto
    @Override
    public double calcularArea() {
        return lado * lado;
    }
}
