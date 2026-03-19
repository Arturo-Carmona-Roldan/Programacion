import java.time.LocalDate;

public class Profesorinterino extends Profesor {
    private LocalDate fechacomienzo;

    public Profesorinterino(String nombre, LocalDate fechaNacimiento, int codpro, int concat, LocalDate fechacomienzo) {
        super(nombre, fechaNacimiento, codpro, concat);
        this.fechacomienzo = fechacomienzo;
    }

    public LocalDate getFechacomienzo() {
        return fechacomienzo;
    }
}
