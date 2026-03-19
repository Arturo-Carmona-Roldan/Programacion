import java.util.*;

public class Esquinas_Matriz {
    public static Scanner teclado = new Scanner(System.in);
    public static int m, n;
    public static int[][] matriz = new int[0][0];

    public static void cargar_matriz() {
        System.out.println("Ingresa el número de filas que tiene que tener la matriz");
        n = teclado.nextInt();
        System.out.println("Ingresa el numero de columnas que tiene que tener la matriz");
        m = teclado.nextInt();
        matriz = new int[n][m];

    }

    public static void llenar_matriz() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = (int) (Math.random() * (10 + 1));
            }
        }
    }

    public static void cambiar_valores() {
        System.out.println("\nLa matriz antes de cargar valores es: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("( " + matriz[i][j] + " ) ");
            }
            System.out.println();
        }

        int[] aux = matriz[0];
        matriz[0] = matriz[1];
        matriz[1] = aux;

        System.out.println("\nY ahora la matriz es : ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("( " + matriz[i][j] + " ) ");
            }
            System.out.println();
        }
    }

    public static void mostrar_esquinas() {
        System.out.println("\n--Las esquinas de la matriz son-- ");
        System.out.println("Esquina superior izquierda: " + matriz[0][0]);
        System.out.println("Esquina superior derecha: " + matriz[0][m-1]);
        System.out.println("Esquina inferior izquierda: " + matriz[n-1][0]);
        System.out.println("Esquina inferior derecha: " + matriz[n-1][m-1]);

    }

    public static void main(String[] args) {
        cargar_matriz();
        llenar_matriz();
        cambiar_valores();
        mostrar_esquinas();
    }
}
