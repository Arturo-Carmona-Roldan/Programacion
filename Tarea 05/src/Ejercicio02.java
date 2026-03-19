import java.util.*;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce la fecha que quieres revisar");
        String fecha = teclado.nextLine();
        if (fecha.matches("(0[1-9]|[12][0-9]|[3][0-1])/([0][1-9]|[1][0-2])/(20\\d{2})")) {
            System.out.println("La fecha es valida");
        } else {
            System.out.println("La fecha no es valida");
        }
    }
}