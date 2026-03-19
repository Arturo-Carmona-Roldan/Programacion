import java.util.*;

public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una fecha (formato dd/mes(con 3 letras)/aa): ");
        String fecha = teclado.nextLine().toLowerCase();

        if (fecha.matches("^([0]?[1-9]|[12][0-9]|3[01])\\-(ene|feb|mar|abr|may|jun|jul|ago|sep|oct|nov|dic)\\/\\d{2}")) {
            System.out.println("La fecha sí es válida");
        } else {
            System.out.println("La fecha no es válida");
        }

    }
    }

