import java.util.*;

public class Ejercicio06 {
    public static Scanner teclado = new Scanner(System.in);
    public static String[] nombres = new String[2];
    public static int[] edades = new int[2];

    public static int recuento = 0;
    public static int recuento_menor = 0;

    public static void nombres() {
        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Introduce un nombre: ");
            nombres[i] = teclado.nextLine();
        }
    }

    public static void edades() {
        for (int i = 0; i < edades.length; i++) {
            boolean valido;
            do {
                valido = true;
                System.out.println("\nIngresa la edad de " + nombres[i]);
                if (teclado.hasNextInt()) {
                    edades[i] = teclado.nextInt();
                    teclado.nextLine();

                    if (edades[i] < 18) {
                        recuento_menor++;
                    }

                } else {
                    System.out.println("La edad tiene que ser un número");
                    teclado.nextLine();
                    valido = false;
                }
            } while (!valido);
        }
    }

    public static void empezar() {
        for (int i = 0; i < nombres.length; i++) {
            String n = nombres[i].toLowerCase();

            if ((n.startsWith("a") || n.startsWith("m")) && edades[i] >= 18) {
                recuento++;
            }
        }
        System.out.println("Hay " + recuento +
                " nombres que empiezan por 'a' o 'm' y son mayores de edad.");
    }

    public static void ordenar_edades() {

        String[] nombres_aux = new String[recuento_menor];
        int[] edades_aux = new int[recuento_menor];

        int x = 0;
        for (int i = 0; i < edades.length; i++) {
            if (edades[i] < 18) {
                nombres_aux[x] = nombres[i];
                edades_aux[x] = edades[i];
                x++;
            }
        }

        for (int i = 0; i < edades_aux.length - 1; i++) {
            for (int j = i + 1; j < edades_aux.length; j++) {
                if (edades_aux[i] > edades_aux[j]) {
                    int tempEdad = edades_aux[i];
                    edades_aux[i] = edades_aux[j];
                    edades_aux[j] = tempEdad;

                    String tempNombre = nombres_aux[i];
                    nombres_aux[i] = nombres_aux[j];
                    nombres_aux[j] = tempNombre;
                }
            }
        }

        System.out.println("Menores de edad ordenados por edad:");
        for (int i = 0; i < nombres_aux.length; i++) {
            System.out.println(nombres_aux[i] + " (" + edades_aux[i] + ")");
        }
    }

    public static void nombre_mayor() {
        int maxEdad = -1;
        String nombreMayor = "";

        for (int i = 0; i < edades.length; i++) {
            if (edades[i] > maxEdad) {
                maxEdad = edades[i];
                nombreMayor = nombres[i];
            }
        }

        System.out.println("\nLa persona de mayor edad es: " +
                nombreMayor + " (" + maxEdad + " años)");
    }

    public static void main(String[] args) {
        nombres();
        edades();
        empezar();
        ordenar_edades();
        nombre_mayor();
    }
}
