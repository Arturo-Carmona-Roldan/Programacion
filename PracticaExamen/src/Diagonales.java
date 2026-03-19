import java.util.Scanner;

public class Diagonales {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== MENU MATRICES ===");
        System.out.println("1. Matriz regular");
        System.out.println("2. Matriz irregular");
        System.out.print("Elige una opción: ");

        int opcion = sc.nextInt();

        int[][] m;  // la matriz final
        sc.nextLine(); // limpiar salto

        if (opcion == 1) {
            // MATRIZ REGULAR
            System.out.print("Filas: ");
            int f = sc.nextInt();
            System.out.print("Columnas: ");
            int c = sc.nextInt();

            m = new int[f][c];

            // cargarla
            for (int i = 0; i < f; i++) {
                for (int j = 0; j < c; j++) {
                    System.out.print("m[" + i + "][" + j + "]: ");
                    m[i][j] = sc.nextInt();
                }
            }

        } else {
            // MATRIZ IRREGULAR
            System.out.print("Cantidad de filas: ");
            int f = sc.nextInt();
            m = new int[f][];

            for (int i = 0; i < f; i++) {
                System.out.print("Columnas de la fila " + i + ": ");
                int c = sc.nextInt();
                m[i] = new int[c];

                for (int j = 0; j < c; j++) {
                    System.out.print("m[" + i + "][" + j + "]: ");
                    m[i][j] = sc.nextInt();
                }
            }
        }

        // AHORA LA PREGUNTA DE LA ESQUINA
        System.out.println("\n=== ELIGE DESDE QUÉ ESQUINA SACAR LA DIAGONAL ===");
        System.out.println("0. Superior izquierda");
        System.out.println("1. Superior derecha");
        System.out.println("2. Inferior izquierda");
        System.out.println("3. Inferior derecha");
        System.out.print("Opción: ");

        int esquina = sc.nextInt();

        System.out.println("\nDiagonal obtenida:");

        switch (esquina) {

            case 0:  // superior - izquierda
                for (int i = 0; i < m.length; i++) {
                    if (i < m[i].length) {
                        System.out.print(m[i][i] + " ");
                    }
                }
                break;

            case 1:  // superior - derecha
                for (int i = 0; i < m.length; i++) {
                    int col = m[i].length - 1 - i;
                    if (col >= 0 && col < m[i].length) {
                        System.out.print(m[i][col] + " ");
                    }
                }
                break;

            case 2:  // inferior - izquierda
                for (int i = m.length - 1; i >= 0; i--) {
                    int filaDesdeAbajo = m.length - 1 - i;
                    if (filaDesdeAbajo < m[i].length) {
                        System.out.print(m[i][filaDesdeAbajo] + " ");
                    }
                }
                break;

            case 3:  // inferior - derecha
                for (int i = m.length - 1; i >= 0; i--) {
                    int col = m[i].length - 1 - (m.length - 1 - i);
                    if (col >= 0 && col < m[i].length) {
                        System.out.print(m[i][col] + " ");
                    }
                }
                break;

            default:
                System.out.println("Opción inválida bro.");
        }
    }
}
