package Ejercicio2;

public class Estudiante extends Persona {
    protected String curso;

    public Estudiante(String dni, String nombre, String apellidos, String estado_civil, String curso) {
        super(dni, nombre, apellidos, estado_civil);
        this.curso = curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String toString() {
        return super.toString() +
                ", curso='" + curso;
    }
}