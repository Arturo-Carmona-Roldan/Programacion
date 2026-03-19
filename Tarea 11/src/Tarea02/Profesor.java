package Tarea02;

public class Profesor extends Empleado{
    private String departamento;

    public Profesor(String nombre, String apellido, String DNI, String estado_civil,
                    String anyo_incorporacion, String numero_asociado, String departamento) {
        super(nombre, apellido, DNI, estado_civil, anyo_incorporacion, numero_asociado);
        this.departamento = departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String toString() {
        return super.toString() + "\nDepartamento: " + departamento;
    }
}