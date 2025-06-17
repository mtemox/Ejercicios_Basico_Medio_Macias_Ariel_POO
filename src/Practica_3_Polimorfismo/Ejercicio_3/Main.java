package Practica_3_Polimorfismo.Ejercicio_3;

public class Main {
    public static void main(String[] args) {
        // Arreglo de Empleado
        Empleado[] empleados = { new Gerente(), new Asistente() };
        // Creo un bucle para recorrer el arreglo
        for (Empleado emp : empleados) {
            emp.mostrarInfo();  // Polimorfismo en acción
        }
    }
}
