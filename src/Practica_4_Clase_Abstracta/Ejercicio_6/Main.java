package Practica_4_Clase_Abstracta.Ejercicio_6;

public class Main {
    public static void main(String[] args) {
        // Creo un objeto Usuario
        Usuario user = new Usuario();
        // Llamo a los metodos
        user.setPassword("clave123");
        user.setPassword("abc");
        user.mostrarPassword();
    }
}