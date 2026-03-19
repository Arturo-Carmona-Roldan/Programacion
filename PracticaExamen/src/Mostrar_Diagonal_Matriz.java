import java.util.Scanner;

public class Mostrar_Diagonal_Matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] m = new int[4][4];

        System.out.println("Cargá los 16 valores:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                m[i][j] = sc.nextInt();
            }
        }

        System.out.println("Diagonal principal:");
        for (int i = 0; i < 4; i++) {
            System.out.println(m[i][i]);
        }
    }
}
