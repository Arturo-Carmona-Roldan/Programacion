import java.util.Scanner;

public class Filas_Menor_Mayor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] m = new int[4][4];

        System.out.println("Cargá la matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                m[i][j] = sc.nextInt();
            }
        }

        // ORDENAR CADA FILA
        for (int i = 0; i < 4; i++) {                   // Recorro filas
            for (int pasada = 0; pasada < 3; pasada++) {   // Burbuja pasadas
                for (int j = 0; j < 3 - pasada; j++) {     // Comparaciones
                    if (m[i][j] > m[i][j + 1]) {
                        int aux = m[i][j];
                        m[i][j] = m[i][j + 1];
                        m[i][j + 1] = aux;
                    }
                }
            }
        }

        System.out.println("Matriz con filas ordenadas:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}
