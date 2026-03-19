package Ejercicio2;

public class Profesor extends Empleado {
    protected String departamento;

    public Profesor(String dni, String nombre, String apellidos, String estado_civil, int anio_incorp, String despacho,
            String departamento) {
        super(dni, nombre, apellidos, estado_civil, anio_incorp, despacho);
        this.departamento = departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String toString() {
        return super.toString() +
                ", departamento='" + departamento;
    }
}