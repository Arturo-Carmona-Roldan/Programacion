package Tarea02;

public class Personal extends Empleado{
    private String zona;

    public Personal(String nombre, String apellido, String DNI, String estado_civil,
                    String anyo_incorporacion, String numero_asociado, String zona) {
        super(nombre, apellido, DNI, estado_civil, anyo_incorporacion, numero_asociado);
        this.zona = zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String toString() {
        return super.toString() + "\nZona: " + zona;
    }
}