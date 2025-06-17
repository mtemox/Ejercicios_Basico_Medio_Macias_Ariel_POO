package Practica_3_Polimorfismo.Ejercicio_2;

public class Moto extends Vehiculo{
    // Sobreescritura de los metodos
    @Override
    public void arrancar() {
        System.out.println("La moto arranca con botón.");
    }
}
