import java.util.*;

public class Ejercicio04 {
    public static int[] num20 = new int[20];
    public static int[] numGrandes = new int[5];
    public static int[] numPequennos = new int[5];
    public static int[] aux = new int[20];
    public static Scanner teclado = new Scanner(System.in);

    public static void CargarVector() {
        for (int i = 0; i < num20.length; i++) {
            num20[i] = (int) (Math.random() * 301);
            num20[i] = num20[i] + 500;
        }
    }

    public static void ascendente() {
        Arrays.sort(num20);
    }

    public static void descendente() {
        Arrays.sort(num20);
        int j = aux.length - 1;
        for (int i = 0; i < 20; i++) {
            aux[j] = num20[i];
            j--;
        }
    }

    public static void CargarPequeños() {
        Arrays.sort(num20);
        for (int i = 0; i < 5; i++) {
            numPequennos[i] = num20[i];
        }

    }

    public static void CargarGrandes() {
        Arrays.sort(num20);
        int j = 0;
        for (int i = 14; i < num20.length - 1; i++) {
            numGrandes[j] = num20[i + 1];
            j++;
        }
    }

    public static void main(String[] args) {
        CargarVector();
        int opcion;
        do {
            System.out.println("\n¿Quieres mostrar los números en forma ascendente o descendente?");
            System.out.println("1. Ascendente");
            System.out.println("2. Descendente");
            System.out.println("0. Salir");
            System.out.print("Elige opción: ");

            while (!teclado.hasNextInt()) {
                System.out.println("Introduce un número válido.");
                teclado.next();
            }
            opcion = teclado.nextInt();

            if (opcion == 1) {
                ascendente();
                System.out.println("\nAscendente:");
                System.out.println(Arrays.toString(num20));

                CargarGrandes();
                CargarPequeños();
                System.out.println("5 números más grandes:  " + Arrays.toString(numGrandes));
                System.out.println("5 números más pequeños:" + Arrays.toString(numPequennos));

            } else if (opcion == 2) {
                descendente();
                System.out.println("\nDescendente:");
                System.out.println(Arrays.toString(aux));

                CargarGrandes();
                CargarPequeños();
                System.out.println("5 números más grandes:  " + Arrays.toString(numGrandes));
                System.out.println("5 números más pequeños:" + Arrays.toString(numPequennos));

            } else if (opcion != 0) {
                System.out.println("Opción inválida.");
            }

        } while (opcion != 0);

    }
}