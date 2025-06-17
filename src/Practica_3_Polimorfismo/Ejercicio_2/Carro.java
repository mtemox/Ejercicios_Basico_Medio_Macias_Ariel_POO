package Practica_3_Polimorfismo.Ejercicio_2;

public class Carro extends Vehiculo {
    // Sobreescritura de los metodos
    @Override
    public void arrancar() {
        System.out.println("El carro arranca con llave.");
    }
}
