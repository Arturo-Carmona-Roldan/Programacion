package Ejercicio2;

public class Empleado extends Persona {
    protected int anio_incorp;
    protected String despacho;

    public Empleado(String dni, String nombre, String apellidos, String estado_civil, int anio_incorp,
            String despacho) {
        super(dni, nombre, apellidos, estado_civil);
        this.anio_incorp = anio_incorp;
        this.despacho = despacho;
    }

    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }

    public String toString() {
        return super.toString() +
                ", anio_incorp=" + anio_incorp +
                ", despacho='" + despacho;
    }
}