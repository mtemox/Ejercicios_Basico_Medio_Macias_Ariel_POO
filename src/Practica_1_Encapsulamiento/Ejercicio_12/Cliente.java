package Practica_1_Encapsulamiento.Ejercicio_12;

public class Cliente {
    // Atributos públicos
    public int codigoCliente;
    public boolean activo = true;
    // Atributos privados
    private String nombre = "";
    private String telefono = "";
    // Setters para los atributos privados
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    // Metodo para mostrar la información del cliente
    public void verCliente() {
        System.out.println("Código de Cliente: " + codigoCliente);
        System.out.println("Nombre: " + nombre);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Activo: " + activo);
    }
}

