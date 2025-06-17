package Practica_4_Clase_Abstracta.Ejercicio_2;

public class EmpleadoPorHoras extends Empleado {
    // Atributos privados de la clase
    private double horas;
    private double tarifa;
    // Validacion
    public EmpleadoPorHoras(double horas, double tarifa) {
        if ((horas > 0) && (tarifa > 0)) {
            this.horas = horas;
            this.tarifa = tarifa;
        } else {
            System.out.println("Las horas y la tarifa deben ser valores positivos. Asignacion por defecto: \nHoras: 40h \nTarifa: 5");
            this.horas = 20;
            this.tarifa = 5;
        }
    }
    // Modificacion del metodo abstracto
    @Override
    public double calcularSalario() {
        return horas * tarifa;
    }
}
