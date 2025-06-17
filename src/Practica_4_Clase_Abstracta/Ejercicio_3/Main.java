package Practica_4_Clase_Abstracta.Ejercicio_3;

public class Main {
    public static void main(String[] args) {
        // Creo el arreglo con objetos transporte
        Transporte[] medios = { new Bus(), new Bicicleta()} ;
        // Llamo a los metodos
        for (Transporte md : medios) {
            md.iniciarViaje();
        }
    }
}
