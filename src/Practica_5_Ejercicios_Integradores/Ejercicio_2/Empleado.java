package Practica_5_Ejercicios_Integradores.Ejercicio_2;

public abstract class Empleado {
    // Atributos de la superclase
    protected String nombre;
    // Constructor sobrecargado
    public Empleado() {
        this.nombre = null;
    }
    public Empleado(String nombre) {
        if (validarNombre(nombre)) {
            this.nombre = nombre;
        } else {
            System.out.println("Error: Nombre inválido");
            this.nombre = null;
        }
    }
    // Metodo que se sobreescribirá
    public abstract void mostrarDatos();
    // Metodo abstracto
    public abstract double calcularSalario();
    // Metodo para validar nombre
    public boolean validarNombre(String nombre) {
        return nombre != null && !nombre.trim().isEmpty();
    }
}
