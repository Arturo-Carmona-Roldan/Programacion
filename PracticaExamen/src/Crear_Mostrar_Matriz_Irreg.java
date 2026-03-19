import java.util.Scanner;

public class Crear_Mostrar_Matriz_Irreg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cantidad de filas: ");
        int f = sc.nextInt();

        int[][] m = new int[f][];

        for (int i = 0; i < f; i++) {
            System.out.print("Columnas de la fila " + i + ": ");
            int c = sc.nextInt();
            m[i] = new int[c];
        }

        System.out.println("Cargar valores:");
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matriz irregular:");
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}


