import java.util.Scanner;

public class Vector_Menor_Mayor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] v = new int[10];

        System.out.println("Cargá los 10 valores:");
        for (int i = 0; i < v.length; i++) {
            v[i] = sc.nextInt();
        }

        // ORDENAR BURBUJA (de menor a mayor)
        for (int i = 0; i < v.length - 1; i++) { // PASADAS
            for (int j = 0; j < v.length - 1 - i; j++) { // COMPARACIONES
                if (v[j] > v[j + 1]) {
                    int aux = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = aux;
                }
            }
        }

        System.out.println("Vector ordenado:");
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
    }
}
