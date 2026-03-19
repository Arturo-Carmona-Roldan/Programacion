import java.util.Scanner;

public class Ejercicio12 {

    public static int[] cromos = new int[100];

    public static void inicializarCromos() {
        for (int i = 0; i < cromos.length; i++) {
            cromos[i] = 0;
        }
    }

    public static void entradaCromo(int numero) {
        if (numero >= 1 && numero <= 100) {
            cromos[numero - 1]++;
            System.out.println("Cromo " + numero + " añadido. Ahora tienes " + cromos[numero - 1] + " de este cromo.");
        } else {
            System.out.println("Número de cromo inválido. Debe ser entre 1 y 100.");
        }
    }

    public static void consultaCromo(int numero) {
        if (numero >= 1 && numero <= 100) {
            int cantidad = cromos[numero - 1];
            if (cantidad == 0) {
                System.out.println("No tienes el cromo " + numero + ".");
            } else {
                System.out.println("Tienes " + cantidad + " copias del cromo " + numero + ".");
            }
        } else {
            System.out.println("Número de cromo inválido. Debe ser entre 1 y 100.");
        }
    }

    public static void listaRepetidos() {
        System.out.println("\n--- Cromos repetidos ---");
        boolean hayRepetidos = false;
        for (int i = 0; i < cromos.length; i++) {
            if (cromos[i] > 1) {
                System.out.println("Cromo " + (i + 1) + ": " + cromos[i] + " copias");
                hayRepetidos = true;
            }
        }
        if (!hayRepetidos) {
            System.out.println("No hay cromos repetidos.");
        }
    }

    public static void listaPendientes() {
        System.out.println("\n--- Cromos pendientes ---");
        boolean hayPendientes = false;
        for (int i = 0; i < cromos.length; i++) {
            if (cromos[i] == 0) {
                System.out.println("Cromo " + (i + 1));
                hayPendientes = true;
            }
        }
        if (!hayPendientes) {
            System.out.println("No hay cromos pendientes. ¡Colección completa!");
        }
    }

    public static void mostrarMenu() {
        System.out.println("\n--- Menú de Colección de Cromos ---");
        System.out.println("1. Entrada de un cromo nuevo");
        System.out.println("2. Consulta de un cromo");
        System.out.println("3. Lista de cromos repetidos");
        System.out.println("4. Lista de cromos pendientes");
        System.out.println("5. Salir");
        System.out.print("Selecciona una opción: ");
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;

        inicializarCromos();

        while (opcion != 5) {
            mostrarMenu();
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Introduce el número del cromo (1-100): ");
                    int nuevo = teclado.nextInt();
                    entradaCromo(nuevo);
                    break;
                case 2:
                    System.out.print("Introduce el número del cromo a consultar (1-100): ");
                    int consulta = teclado.nextInt();
                    consultaCromo(consulta);
                    break;
                case 3:
                    listaRepetidos();
                    break;
                case 4:
                    listaPendientes();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        }


    }
}
