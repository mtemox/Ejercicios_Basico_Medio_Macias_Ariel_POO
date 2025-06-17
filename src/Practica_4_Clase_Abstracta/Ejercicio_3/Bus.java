package Practica_4_Clase_Abstracta.Ejercicio_3;

public class Bus extends Transporte {
    // Sobreescritura del metodo abstracto
    @Override
    public void iniciarViaje() {
        System.out.println("El bus arranca con motor.");
    }
}
