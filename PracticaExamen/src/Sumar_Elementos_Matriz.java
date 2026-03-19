import java.util.Scanner;

public class Sumar_Elementos_Matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] m = new int[3][3];

        System.out.println("Cargá la matriz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m[i][j] = sc.nextInt();
            }
        }

        int suma = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                suma += m[i][j];
            }
        }

        System.out.println("Suma total = " + suma);
    }
}
