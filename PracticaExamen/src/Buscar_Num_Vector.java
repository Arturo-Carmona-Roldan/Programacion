import java.util.*;

public class Buscar_Num_Vector {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int[] v = new int[10];

        System.out.println("Cargá los 10 valores:");
        for (int i = 0; i < v.length; i++) {
            v[i] = sc.nextInt();
        }

        System.out.print("Número a buscar: ");
        int x = sc.nextInt();

        boolean encontrado = false;

        for (int i = 0; i < v.length; i++) {
            if (v[i] == x) {
                System.out.println("Aparece en la posición " + i);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("El número no está en el vector.");
        }
    }
}

