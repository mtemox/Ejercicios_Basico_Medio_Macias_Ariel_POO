package Practica_3_Polimorfismo.Ejercicio_1;

public class Main {
    public static void main(String[] args) {
        // Arreglo de animales
        Animal[] animales = { new Perro(), new Gato() };
        // Creo un bucle para recorrer el arreglo
        for (Animal animal: animales) {
            animal.hacerSonido();
        }
    }
}
