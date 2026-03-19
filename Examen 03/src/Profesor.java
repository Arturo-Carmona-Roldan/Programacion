import java.time.LocalDate;
import java.util.ArrayList;

public class Profesor extends Persona {
    protected int codpro;
    protected int codcat;

    public Profesor(String nombre, LocalDate fechaNacimiento, int codpro, int concat) {
        super(nombre, fechaNacimiento);
        this.codpro = codpro;
        this.codcat = concat;
    }

    public int getCodpro() {
        return codpro;
    }

    public int getCodcat() {
        return codcat;
    }
}
