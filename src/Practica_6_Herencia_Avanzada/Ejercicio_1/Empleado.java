package Practica_6_Herencia_Avanzada.Ejercicio_1;

public class Empleado extends Persona {
    protected double salario;

    public Empleado(String nombre, int edad, double salario) {
        super(nombre, edad); // Reutiliza constructor de Persona
        this.salario = salario;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Salario base: $" + salario);
    }
}
