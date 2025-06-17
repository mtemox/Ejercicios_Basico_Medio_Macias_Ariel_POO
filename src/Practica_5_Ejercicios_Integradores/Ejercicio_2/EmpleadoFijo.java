package Practica_5_Ejercicios_Integradores.Ejercicio_2;

public class EmpleadoFijo extends Empleado {
    // Atributos de la clase
    private double salarioBase;
    // Metodo constructor
    public EmpleadoFijo(String nombre, double salarioBase) {
        super(nombre);
        this.salarioBase = salarioBase;
    }
    // Sobreescritura de metodos
    @Override
    public double calcularSalario() {
        return salarioBase;
    }
    @Override
    public void mostrarDatos() {
        System.out.println("Empleado fijo: " + nombre);
        System.out.println("Salario base: $" + calcularSalario());
    }
    public void aplicarBono(int anios) {
        if (anios > 5) {
            salarioBase += 100;
            System.out.println("Bono aplicado: +$100 por antigüedad");
        }
    }
}
