import java.util.*;

public class Ejercicio08 {
    public static String[] vector = new String[10];
    public static Scanner teclado = new Scanner(System.in);
    public static boolean coincide = false;

    public static void cargarnombre() {


        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingresa el valor del vector " + (i + 1) + ": ");
            vector[i] = teclado.nextLine();
        }
    }

    public static void nombre() {
        System.out.println("Escribe un nombre para verificar si esta dentro de la lista");
        String nombre = teclado.nextLine();

        for (int j = 0; j < vector.length; j++) {
            if (vector[j].equals(nombre)) {
                System.out.println("EL nommbre corresponde a la posicion " + (j + 1));
                coincide = true;
            }
        }
        if (!coincide) {
            System.out.println("Ese nombre no coincide con ninguno de la lista");

        }
    }


    public static void main(String[] args) {

        cargarnombre();
        nombre();
    }

}
