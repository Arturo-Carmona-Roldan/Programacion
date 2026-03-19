import java.util.*;

public class Promedio_Matriz_Irreg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Filas: ");
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

        System.out.println("Promedios:");
        for (int i = 0; i < f; i++) {
            int suma = 0;

            for (int j = 0; j < m[i].length; j++) {
                suma += m[i][j];
            }

            double promedio = (double) suma / m[i].length;
            System.out.println("Fila " + i + ": " + promedio);
        }
    }
}
