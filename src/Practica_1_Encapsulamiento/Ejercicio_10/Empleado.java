package Practica_1_Encapsulamiento.Ejercicio_10;

public class Empleado {
    // Atributos públicos
    public String departamento = "Ventas";
    public String horario;
    // Atributos privados
    private String nombre = "";
    private double salario = 0.0;
    // Métodos set para atributos privados
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    // Metodo para mostrar los datos
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: $" + salario);
        System.out.println("Departamento: " + departamento);
        System.out.println("Horario: " + horario);
    }
}
