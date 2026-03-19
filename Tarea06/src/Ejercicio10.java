import java.util.*;

public class Ejercicio10 {

    public static int[] contador = new int[11];
    public static Scanner teclado = new Scanner(System.in);

    public static void pedirNotas() {
        System.out.println("Introduce notas entre 0 y 10. Introduce un número negativo para terminar:");
    }

    public static void leerNotas() {
        int nota;

        do {
            System.out.print("Nota: ");
            nota = teclado.nextInt();

            if (nota >= 0 && nota <= 10) {
                contador[nota]++;
            }

        } while (nota >= 0);
    }

    public static void mostrarResultados() {
        System.out.println("\n Resultados: ");
        for (int i = 0; i < contador.length; i++) {
            System.out.println("Nota " + i + ": " + contador[i] + " veces");
        }
    }

    public static void main(String[] args) {
        pedirNotas();
        leerNotas();
        mostrarResultados();
    }
}
