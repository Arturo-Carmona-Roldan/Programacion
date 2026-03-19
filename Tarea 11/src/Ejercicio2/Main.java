package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Estudiante e = new Estudiante("11111111A", "Adolfo", "García Pérez", "Soltero", "1º Medicina");
        Personal p = new Personal("22222222B", "Carmen", "Ruiz", "Sanchez", 2003, "1.2.23", "biblioteca");
        Profesor profe = new Profesor("3333333C", "Felipe", "Gomez", "Aranda", 2000, "2.3.12", "Matematicas");
        // cambiar estado civil
        p.setEstado_civil("divorciada");
        // cambiar despacho
        profe.setDespacho("1.1.10");
        // cambiar curso
        e.setCurso("2º Medicina");
        // cambiar departamento
        profe.setDepartamento("Biología");
        // cambiar seccion
        p.setSeccion("Laboratorios");
        System.out.println(e);
        System.out.println(p);
        System.out.println(profe);
    }
}
