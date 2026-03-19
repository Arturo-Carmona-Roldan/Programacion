import java.util.*;

public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresa tu DNI:");
        String dni = teclado.nextLine();
        dni = dni.toUpperCase();

        if (dni.matches("^[0-9]{8}[A-HJ-NP-TV-Z]")) {
            System.out.println("El DNI es válido ");
        } else {
            System.out.println("El DNI no existe");
        }
    }
}