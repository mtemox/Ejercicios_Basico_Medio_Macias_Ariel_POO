package Practica_6_Herencia_Avanzada.Ejercicio_1;

public class Gerente extends Empleado {
    private double bono;
    private boolean bonoAplicado;

    public Gerente(String nombre, int edad, double salario, double bono) {
        super(nombre, edad, salario); // Llama al constructor de Empleado
        if (salario > 800) {
            this.bono = bono;
            bonoAplicado = true;
        } else {
            this.bono = 0;
            bonoAplicado = false;
            System.out.println("Advertencia: Bono no aplicado a " + nombre + " (salario insuficiente)");
        }
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        if (bonoAplicado) {
            System.out.println("Bono aplicado: $" + bono);
            System.out.println("Salario total: $" + (salario + bono));
        } else {
            System.out.println("Sin bono. Salario total: $" + salario);
        }
    }
}
