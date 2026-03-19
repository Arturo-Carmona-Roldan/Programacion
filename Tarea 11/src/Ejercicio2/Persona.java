package Ejercicio2;

public class Persona {
    protected String dni;
    protected String nombre;
    protected String apellidos;
    protected String estado_civil;

    public Persona(String dni, String nombre, String apellidos, String estado_civil) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.estado_civil = estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    public String toString() {
        return "DNI='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", estado_civil='" + estado_civil;
    }
}
