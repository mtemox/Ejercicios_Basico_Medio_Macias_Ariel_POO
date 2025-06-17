package Practica_4_Clase_Abstracta.Ejercicio_2;

public class Main {
    public static void main(String[] args) {
        // Creo los objetos de tipo empleado
        Empleado empleado_fijo = new EmpleadoFijo(600);
        Empleado empleado_por_horas = new EmpleadoPorHoras(40, 5);
        // Llamo a los metodos
        System.out.println("Salario fijo: " + empleado_fijo.calcularSalario());
        System.out.println("Salario por horas: " + empleado_por_horas.calcularSalario());
    }
}
