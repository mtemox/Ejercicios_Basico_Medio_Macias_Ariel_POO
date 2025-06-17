package Practica_7_Ejercicio_Universitario;

public abstract class Persona {
    // Atributos de la clase
    protected String nombre;
    protected int edad;
    // Metodo constructor
    public Persona(String nombre, int edad) {
        if (verificarNombre(nombre)) {
            this.nombre = nombre;
            System.out.println("Nombre registrado con éxito.");
        } else {
            System.out.println("Nombre ingresado no válido.");
            this.nombre = null;
        }

        if (verificarEdad(edad)) {
            this.edad = edad;
            System.out.println("Edad registrada con éxito.");
        } else {
            System.out.println("Edad ingresada no válida.");
            this.edad = 0;
        }
    }
    // Metodo abstracto
    public abstract void mostrarDatos();
    // Metodo para validar el nombre que no esté vacio
    protected boolean verificarNombre(String nombre) {
        return nombre != null && !nombre.trim().isEmpty();
    }
    // Metodo para validar la edad
    protected boolean verificarEdad(int edad) {
        return edad >= 18;
    }
}
