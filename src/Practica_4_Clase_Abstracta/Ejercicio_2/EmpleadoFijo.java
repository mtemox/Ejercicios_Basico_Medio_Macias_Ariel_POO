package Practica_4_Clase_Abstracta.Ejercicio_2;

public class EmpleadoFijo extends Empleado {
    // Atributos privados de la clase
    private double sueldoBase;
    // Validacion
    public EmpleadoFijo(double sueldoBase) {
        if (sueldoBase > 0) {
            this.sueldoBase = sueldoBase;
        } else {
            System.out.println("El sueldo debe ser un valor positivo. Asignacion $470 por defecto.");
            this.sueldoBase = 470;
        }
    }
    // Modificacion del metodo abstracto
    @Override
    public double calcularSalario() {
        return sueldoBase;
    }
}
