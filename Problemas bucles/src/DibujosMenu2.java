import java.util.*;

public class DibujosMenu2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion, n;

        do {
            System.out.println("\n--- Menú de Figuras ---");
            System.out.println("1. Letra A");
            System.out.println("2. Pirámide vacía");
            System.out.println("3. Pirámide invertida vacía");
            System.out.println("4. Diamante");
            System.out.println("5. Triángulo rectángulo");
            System.out.println("6. Flecha");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = teclado.nextInt();

            if (opcion == 0) break;

            System.out.print("Introduce tamaño (número de filas, mínimo 3): ");
            n = teclado.nextInt();
            if (n < 3) n = 3;

            switch (opcion) {
                case 1: // Letra A
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n; j++) {
                            if (i == 0 && j == n / 2 || j == n / 2 - i || j == n / 2 + i || i == n / 2 && j > n / 2 - i && j < n / 2 + i)
                                System.out.print("*");
                            else
                                System.out.print(" ");
                        }
                        System.out.println();
                    }
                    break;

                case 2: // Pirámide vacía
                    for (int i = 1; i <= n; i++) {
                        for (int j = 1; j <= n - i; j++) System.out.print(" ");
                        for (int j = 1; j <= 2*i - 1; j++) {
                            if (j == 1 || j == 2*i -1 || i == n) System.out.print("*");
                            else System.out.print(" ");
                        }
                        System.out.println();
                    }
                    break;

                case 3: // Pirámide invertida vacía
                    for (int i = n; i >= 1; i--) {
                        for (int j = 1; j <= n - i; j++) System.out.print(" ");
                        for (int j = 1; j <= 2*i -1; j++) {
                            if (j == 1 || j == 2*i -1 || i == n) System.out.print("*");
                            else System.out.print(" ");
                        }
                        System.out.println();
                    }
                    break;

                case 4: // Diamante
                    // Mitad superior (pirámide)
                    for (int i = 1; i <= n; i++) {
                        for (int j = 1; j <= n - i; j++) System.out.print(" ");
                        for (int j = 1; j <= 2*i -1; j++) System.out.print("*");
                        System.out.println();
                    }
                    // Mitad inferior (pirámide invertida)
                    for (int i = n-1; i >= 1; i--) {
                        for (int j = 1; j <= n - i; j++) System.out.print(" ");
                        for (int j = 1; j <= 2*i -1; j++) System.out.print("*");
                        System.out.println();
                    }
                    break;

                case 5: // Triángulo rectángulo
                    for (int i = 1; i <= n; i++) {
                        for (int j = 1; j <= i; j++) System.out.print("*");
                        System.out.println();
                    }
                    break;

                case 6: // Flecha (triángulo rectángulo + pirámide invertida)
                    // Triángulo creciente
                    for (int i = 1; i <= n; i++) {
                        for (int j = 1; j <= i; j++) System.out.print("*");
                        System.out.println();
                    }
                    // Triángulo decreciente
                    for (int i = n-1; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) System.out.print("*");
                        System.out.println();
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
