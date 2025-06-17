package Practica_5_Ejercicios_Integradores.Ejercicio_2;

public class Main {
    public static void main(String[] args) {
        // Creo los objetos
        EmpleadoFijo luis = new EmpleadoFijo("Luis", 500);
        EmpleadoPorComision maria = new EmpleadoPorComision("María", 1000, 10);
        // Aplicar bono si corresponde
        luis.aplicarBono(6);
        maria.aplicarBono();
        // Mostrar datos actualizados
        System.out.println();
        luis.mostrarDatos();
        System.out.println();
        maria.mostrarDatos();
        // Ejemplo con nombre inválido
        EmpleadoFijo anonimo = new EmpleadoFijo("", 400);
        anonimo.mostrarDatos();
    }
}
