package Practica_4_Clase_Abstracta.Ejercicio_6;

public class Usuario {
    // Atributos de la clase
    private String password;
    // Metodo set con validacion
    public void setPassword(String password) {
        if (password.length() >= 8) {
            this.password = password;
            System.out.println("Contraseña aceptada");
        } else {
            System.out.println("Error: Contraseña demasiado corta. Mínimo 8 caracteres.");
        }
    }
    // Metodo para mostrar la contraseña actual
    public void mostrarPassword() {
        System.out.println("Contraseña almacenada: " + password);
    }
}
