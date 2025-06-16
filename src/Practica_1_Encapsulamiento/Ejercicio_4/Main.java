package Practica_1_Encapsulamiento.Ejercicio_4;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Scanner para leer datos por teclado
        Scanner sc = new Scanner(System.in);
        // Creo un objeto Cuenta
        Cuenta c1 = new Cuenta();
        // Accedo al metodo de Cuenta
        System.out.print("Introduzca su contraseña: ");
        String password = sc.nextLine();
        c1.setPassword(password);
        System.out.print("Su constraseña se registro correctamente.");
    }
}
