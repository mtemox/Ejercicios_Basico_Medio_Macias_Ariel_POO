package Practica_5_Ejercicios_Integradores.Ejercicio_1;

public class CursoCertificado extends Curso {
    // Atributos de la clase
    private double costoBase;
    private double recarga;
    // Metodo constructor
    public CursoCertificado(String nombre, double costoBase, double recarga) {
        super(nombre);
        this.costoBase = costoBase;
        this.recarga = recarga;
    }
    // Sobreescritura del metodo abstracto
    @Override
    public double calcularCosto() {
        return costoBase + recarga;
    }
}
