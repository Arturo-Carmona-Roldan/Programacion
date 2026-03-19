import java.util.Scanner;

public class Columnas_Mayor_Menor {
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

        // ORDENAR CADA COLUMNA (Bubble sort)
        for (int col = 0; col < c; col++) {   // recorremos cada columna
            for (int x = 0; x < f - 1; x++) {
                for (int y = 0; y < f - 1 - x; y++) {

                    if (m[y][col] < m[y + 1][col]) {   // mayor a menor
                        int aux = m[y][col];
                        m[y][col] = m[y + 1][col];
                        m[y + 1][col] = aux;
                    }
                }
            }
        }

        // MOSTRAR MATRIZ ORDENADA
        System.out.println("\nMatriz con columnas ordenadas DE MAYOR A MENOR:");
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}
