package Practica_5_Ejercicios_Integradores.Ejercicio_1;

public class CursoRegular extends Curso {
    // Atributos de la clase
    private double costoBase;
    // Metodo constructor
    public CursoRegular(String nombre, double costoBase) {
        super(nombre);
        this.costoBase = costoBase;
    }
    // Sobreescritura del metodo abstracto
    @Override
    public double calcularCosto() {
        return costoBase;
    }
}
