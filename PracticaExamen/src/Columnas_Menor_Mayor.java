import java.util.Scanner;

public class Columnas_Menor_Mayor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] m = new int[4][4];

        System.out.println("Cargá la matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                m[i][j] = sc.nextInt();
            }
        }

        // ORDENAR COLUMNAS
        for (int col = 0; col < 4; col++) {               // Recorro columnas
            for (int pasada = 0; pasada < 3; pasada++) {  // Pasadas del burbuja
                for (int fila = 0; fila < 3 - pasada; fila++) {  // Comparaciones
                    if (m[fila][col] > m[fila + 1][col]) {
                        int aux = m[fila][col];
                        m[fila][col] = m[fila + 1][col];
                        m[fila + 1][col] = aux;
                    }
                }
            }
        }

        System.out.println("Matriz con columnas ordenadas:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}
