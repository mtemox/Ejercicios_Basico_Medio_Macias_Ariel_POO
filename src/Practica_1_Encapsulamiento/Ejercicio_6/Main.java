package Practica_1_Encapsulamiento.Ejercicio_6;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Creo un objeto Scanner para datos por teclado
        Scanner sc = new Scanner(System.in);
        // Creo un objeto Estudiante
        Estudiante e1 = new Estudiante();
        // Accedo al metodo de Estudiante
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese la carrera: ");
        String carrera = sc.nextLine();
        e1.setNombre(nombre);
        e1.setCarrera(carrera);
        System.out.println("Nombre del estudiante: " + e1.getNombre());
        System.out.println("Carrera del estudiante: " + e1.getCarrera());
    }
}
