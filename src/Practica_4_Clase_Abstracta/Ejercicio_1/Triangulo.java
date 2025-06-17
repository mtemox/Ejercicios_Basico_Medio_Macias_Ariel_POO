package Practica_4_Clase_Abstracta.Ejercicio_1;

public class Triangulo extends Figura {
    // Atributos privados
    private double base;
    private double altura;
    // Metodo constructor con verificacion
    public Triangulo(double base, double altura) {
        if ((base > 0) && (altura > 0)) {
            this.base = base;
            this.altura = altura;
        } else {
            System.out.print("La base y altura deben ser positivos. Usando 1 por defecto.");
            this.base = 1;
            this.altura = 1;
        }
    }
    // Modificacion del metodo abstracto
    @Override
    public double calcularArea() {
        return (base * altura)/2;
    }
}
