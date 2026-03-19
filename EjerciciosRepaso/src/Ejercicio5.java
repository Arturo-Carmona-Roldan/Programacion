import java.util.*;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String palabra1, palabra2, palabra3, temp;

        // Pedimos las tres palabras
        System.out.print("Introduce la primera palabra: ");
        palabra1 = teclado.nextLine();
        System.out.print("Introduce la segunda palabra: ");
        palabra2 = teclado.nextLine();
        System.out.print("Introduce la tercera palabra: ");
        palabra3 = teclado.nextLine();

        // Ordenamos manualmente usando compareToIgnoreCase()
        //Si devuelve >0 significa que palabra 1 va despues que palabra 2 alfabeticamente
        if (palabra1.compareToIgnoreCase(palabra2) > 0) {
            temp = palabra1;
            palabra1 = palabra2;
            palabra2 = temp;
        }

        if (palabra2.compareToIgnoreCase(palabra3) > 0) {
            temp = palabra2;
            palabra2 = palabra3;
            palabra3 = temp;
        }

        // Volvemos a comprobar la primera pareja por si el segundo intercambio cambió algo
        if (palabra1.compareToIgnoreCase(palabra2) > 0) {
            temp = palabra1;
            palabra1 = palabra2;
            palabra2 = temp;
        }

        // Mostramos las palabras ordenadas
        System.out.println("Las palabras ordenadas alfabéticamente son:");
        System.out.println(palabra1);
        System.out.println(palabra2);
        System.out.println(palabra3);

    }
}
