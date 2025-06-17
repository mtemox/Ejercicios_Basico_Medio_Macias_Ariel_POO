package Practica_4_Clase_Abstracta.Ejercicio_5;

public class Estudiante {
    // Atributo privado de la clase
    private double nota = 0.0;
    // Metodo set para nota con validacion
    public void setNota(double nota) {
        if ((nota >= 0) && (nota <= 10)) {
            this.nota = nota;
            System.out.println("Nota válida registrada: " + this.nota);
        } else {
            System.out.println("Error: Nota fuera de rango");
        }
    }
    // Metodo para ver la nota almacenada
    public void mostrarNota() {
        System.out.println("Nota actual: " + nota);
    }
}
