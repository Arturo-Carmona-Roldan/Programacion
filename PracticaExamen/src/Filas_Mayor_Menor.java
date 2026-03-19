import java.util.Scanner;

public class Filas_Mayor_Menor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Cantidad de filas: ");
        int f = sc.nextInt();
        System.out.print("Cantidad de columnas: ");
        int c = sc.nextInt();

        int[][] m = new int[f][c];

        // CARGAR MATRIZ
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                m[i][j] = sc.nextInt();
            }
        }

        // ORDENAR CADA FILA (Bubble sort)
        for (int i = 0; i < f; i++) {       // recorremos cada fila
            for (int x = 0; x < c - 1; x++) {
                for (int y = 0; y < c - 1 - x; y++) {

                    if (m[i][y] < m[i][y + 1]) {  // mayor a menor
                        int aux = m[i][y];
                        m[i][y] = m[i][y + 1];
                        m[i][y + 1] = aux;
                    }
                }
            }
        }

        // MOSTRAR MATRIZ ORDENADA
        System.out.println("\nMatriz con filas ordenadas DE MAYOR A MENOR:");
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}
