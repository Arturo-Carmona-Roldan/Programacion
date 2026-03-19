import java.util.Scanner;

public class Vector_Mayor_Menor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el tamaño del vector: ");
        int n = sc.nextInt();

        int[] v = new int[n];

        // Cargar el vector
        for (int i = 0; i < n; i++) {
            System.out.print("Introduce el valor " + (i + 1) + ": ");
            v[i] = sc.nextInt();
        }

        // BUBBLE SORT DE MAYOR A MENOR
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (v[j] < v[j + 1]) {     // ← ACA ESTÁ EL CAMBIO IMPORTANTE
                    int aux = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = aux;
                }
            }
        }

        // Mostrar el vector ordenado
        System.out.println("\nVector ordenado de MAYOR a MENOR:");
        for (int i = 0; i < n; i++) {
            System.out.print(v[i] + " ");
        }
    }
}
