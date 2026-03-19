package invitados;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;

// implementa que la clase se pueda comparar con otra del mismo tipo(invitado), esto obliga a añadir el metodo de abajo
//(public int compareTo(Invitado otro))...
//sin esto java no sabe que metodo usar para hacer comparaciones
public class Invitado implements Comparable<Invitado> {
    protected String DNI;
    protected String nombre;
    protected String fecha_nacimiento;

    public Invitado(String DNI, String nombre, String fecha_nacimiento) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getDNI() {
        return DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public int getEdad() {

        //cambia la String fecha_nacimiento a LocalDate fecha_nac con el formato dd/MM/yyyy
        LocalDate fecha_nac = LocalDate.parse(fecha_nacimiento, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        int anios = Period.between(fecha_nac, LocalDate.now()).getYears();
        return anios;
    }

    @Override
    public String toString() {
        return "Invitado{" +
                "DNI='" + DNI + '\'' +
                ", nombre='" + nombre + '\'' +
                ", fecha_nacimiento='" + fecha_nacimiento + '\'' +
                '}';
    }

    public int compareTo(Invitado otro) {
        //compara el nombre del invitado con el que estemos trabajando con el nombre del invitado que le pasemos al metodo
        //esto es la regla de comparacion
        return this.nombre.compareToIgnoreCase(otro.nombre);
    }

    // con el public estatic esta creando otra variable que equivale a otra forma de comparacion, cuando se le llame usara
    //la comparacion (int compare) y no el compareTo de arriba
    public static Comparator<Invitado> ORDEN_EDAD = new Comparator<Invitado>() {
        @Override
        public int compare(Invitado o1, Invitado o2) {
            return o1.getEdad() - o2.getEdad();
        }
    };
}
/*
Con lambda:
// Ordenar por edad
invitados.sort((a,b) -> a.getEdad() - b.getEdad());

// Ordenar por nombre
invitados.sort((a,b) -> a.getNombre().compareTo(b.getNombre()));


Con Comparable:
// compareTo dentro de Invitado ordena por edad
Collections.sort(invitados); // edad

// Para nombre tendrías que usar Comparator extra
invitados.sort(Comparator.comparing(Invitado::getNombre));

Bro, la idea es: Comparable sirve para un criterio “por defecto”,
lambda /Comparator sirve para criterios puntuales y flexibles.
 */

/*      Otras comparaciones
*
*
*
*
* */