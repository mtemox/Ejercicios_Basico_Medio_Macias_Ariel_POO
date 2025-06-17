package Practica_4_Clase_Abstracta.Ejercicio_3;

public class Bicicleta extends Transporte {
    // Sobreescritura del metodo abstracto
    @Override
    public void iniciarViaje() {
        System.out.println("La bicicleta comienza a pedalear.");
    }
}
