package Tarea02;

public class Empleado extends Persona{
    protected String anyo_incorporacion, numero_asociado;

    public Empleado(String nombre, String apellido, String DNI, String estado_civil, String anyo_incorporacion, String numero_asociado) {
        super(nombre, apellido, DNI, estado_civil);
        this.anyo_incorporacion = anyo_incorporacion;
        this.numero_asociado = numero_asociado;
    }

    public void setNumero_asociado(String numero_asociado) {
        this.numero_asociado = numero_asociado;
    }

    public String toString() {
        return super.toString() +
                "\nAño de incorporacion: " + anyo_incorporacion +
                "\nNumero_asociado: " + numero_asociado;
    }
}
