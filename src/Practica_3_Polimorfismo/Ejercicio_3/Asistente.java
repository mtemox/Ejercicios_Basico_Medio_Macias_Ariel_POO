package Practica_3_Polimorfismo.Ejercicio_3;

public class Asistente extends Empleado {
    // Sobreescritura del metodo
    @Override
    public void mostrarInfo() {
        System.out.println("Soy asistente del área administrativa.");
    }
}
