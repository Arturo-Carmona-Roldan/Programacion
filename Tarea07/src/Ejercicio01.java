import java.util.*;

public class Ejercicio01 {
    public static String[] nombres = new String[10];
    public static int[] edades = new int[10];
    public static Scanner teclado = new Scanner(System.in);

    public static void introducirnombres() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce un nombre");
            nombres[i] = teclado.nextLine();
        }
    }

    public static void introduciredad() {
            for (int i = 0; i < 10; i++) {
                System.out.println("Introduce la edad");

                while (!teclado.hasNextInt()) {
                    System.out.println("La edad tiene que ser un número");
                    teclado.nextLine();
                }

                edades[i] = teclado.nextInt();
                teclado.nextLine();
            }
        }

    public static void menu() {
        System.out.println("1. Lista de personas con edad conocida");
        System.out.println("2. Lista de personas con nombre conocido");
        System.out.println("0. Salir");
        System.out.println("Elije una opción");
        int opcion = teclado.nextInt();

        if (opcion == 1) {
            teclado.nextLine();
            System.out.println("Introduce una edad");
            int edad = teclado.nextInt();
            System.out.println("\n -- Lista de personas con esa edad --");
            for (int i = 0; i < 10; i++) {
                if (edad == edades[i]) {
                    System.out.println(nombres[i]);

                }
            }
        } else if (opcion == 2) {
            teclado.nextLine();
            System.out.println("Introduce un nombre");
            String nombre = teclado.nextLine();
            System.out.println("\n -- Edades de las personas con ese nombre --");
            for (int i = 0; i < 10; i++) {
                if (nombre.equals(nombres[i])) {
                    System.out.println(edades[i]);
                }

            }
        }
    }

    public static void main(String[] args) {
        introducirnombres();
        introduciredad();
        menu();
    }


}

