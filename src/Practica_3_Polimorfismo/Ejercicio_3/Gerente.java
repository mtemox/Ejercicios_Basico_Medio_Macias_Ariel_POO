package Practica_3_Polimorfismo.Ejercicio_3;

public class Gerente extends Empleado {
    // Sobreescritura del metodo
    @Override
    public void mostrarInfo() {
        System.out.println("Soy el gerente de la empresa.");
    }
}
