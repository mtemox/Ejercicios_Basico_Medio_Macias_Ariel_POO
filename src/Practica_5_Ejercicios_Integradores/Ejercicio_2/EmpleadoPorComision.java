package Practica_5_Ejercicios_Integradores.Ejercicio_2;

public class EmpleadoPorComision extends Empleado {
    // Atributos de la clase
    private double ventas;
    private double porcentaje;
    // Metodo constructor
    public EmpleadoPorComision(String nombre, double ventas, double porcentaje) {
        super(nombre);
        this.ventas = ventas;
        this.porcentaje = porcentaje;
    }
    // Sobreescritura de metodos
    @Override
    public double calcularSalario() {
        return ventas + (ventas * porcentaje / 100);
    }
    // Sobreescritura de metodos
    @Override
    public void mostrarDatos() {
        System.out.println("Empleado por comisión: " + nombre);
        System.out.println("Salario total (con comisión): $" + calcularSalario());
    }
    // Sobreescritura de metodos
    public void aplicarBono() {
        if (ventas > 1000) {
            ventas += 200;
            System.out.println("Bono aplicado: +$200 por ventas altas");
        }
    }
}
