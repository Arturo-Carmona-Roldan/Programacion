package Ejercicio2;

public class Personal extends Empleado {
    protected String seccion;

    public Personal(String dni, String nombre, String apellidos, String estado_civil, int anio_incorp, String despacho,
            String seccion) {
        super(dni, nombre, apellidos, estado_civil, anio_incorp, despacho);
        this.seccion = seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String toString() {
        return super.toString() +
                ", seccion='" + seccion;
    }
}