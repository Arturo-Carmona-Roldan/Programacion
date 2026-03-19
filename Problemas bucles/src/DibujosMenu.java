import java.util.*;

public class DibujosMenu {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion, n;

        do {
            // Mostramos el menú
            System.out.println("\n--- Menú de Dibujos ---");
            System.out.println("1. Pirámide");
            System.out.println("2. Pirámide invertida");
            System.out.println("3. Cuadrado relleno");
            System.out.println("4. Cuadrado sin rellenar");
            System.out.println("5. Árbol de Navidad");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = teclado.nextInt();

            if (opcion == 0) break;

            System.out.print("Introduce el tamaño (número de filas): ");
            n = teclado.nextInt();

            switch (opcion) {
                case 1: // Pirámide
                    for (int i = 1; i <= n; i++) {
                        for (int j = 1; j <= n - i; j++) System.out.print(" ");
                        for (int j = 1; j <= 2*i - 1; j++) System.out.print("*");
                        System.out.println();
                    }
                    break;

                case 2: // Pirámide invertida
                    for (int i = n; i >= 1; i--) {
                        for (int j = 1; j <= n - i; j++) System.out.print(" ");
                        for (int j = 1; j <= 2*i - 1; j++) System.out.print("*");
                        System.out.println();
                    }
                    break;

                case 3: // Cuadrado relleno
                    for (int i = 1; i <= n; i++) {
                        for (int j = 1; j <= n; j++) System.out.print("*");
                        System.out.println();
                    }
                    break;

                case 4: // Cuadrado sin rellenar
                    for (int i = 1; i <= n; i++) {
                        for (int j = 1; j <= n; j++) {
                            if (i == 1 || i == n || j == 1 || j == n) System.out.print("*");
                            else System.out.print(" ");
                        }
                        System.out.println();
                    }
                    break;

                case 5: // Árbol de Navidad (pirámide con palo)
                    // Pirámide
                    for (int i = 1; i <= n; i++) {
                        for (int j = 1; j <= n - i; j++) System.out.print(" ");
                        for (int j = 1; j <= 2*i - 1; j++) System.out.print("*");
                        System.out.println();
                    }
                    // Palo del árbol (2 filas, 1 asterisco centrado)
                    for (int i = 1; i <= 2; i++) {
                        for (int j = 1; j <= n - 1; j++) System.out.print(" ");
                        System.out.println("*");
                    }
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (true);

        System.out.println("¡Hasta luego!");
        teclado.close();
    }
}
