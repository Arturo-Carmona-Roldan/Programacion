package Tarea02;

public class Persona {
    protected String nombre,apellido,DNI,estado_civil;

    public Persona(String nombre, String apellido, String DNI, String estado_civil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.estado_civil = estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    public String toString() {
        return "Nombre: " + nombre +
                "\nApellido: " + apellido +
                "\nDNI: " + DNI +
                "\nEstado_civil: " + estado_civil ;
    }
}
