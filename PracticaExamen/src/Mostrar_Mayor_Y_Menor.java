import java.util.Scanner;

public class Mostrar_Mayor_Y_Menor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] v = new int[8];

        System.out.println("Cargá los 8 valores:");
        for (int i = 0; i < v.length; i++) {
            v[i] = sc.nextInt();
        }

        int max = v[0];
        int min = v[0];

        for (int i = 0; i < v.length; i++) {
            if (v[i] > max) {
                max = v[i];
            }
            if (v[i] < min) {
                min = v[i];
            }
        }

        System.out.println("Mayor: " + max);
        System.out.println("Menor: " + min);
    }
}
