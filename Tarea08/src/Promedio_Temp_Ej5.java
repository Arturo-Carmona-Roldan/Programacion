import java.util.*;

public class Promedio_Temp_Ej5 {
    public static Scanner teclado = new Scanner(System.in);
    public static String[] paises = new String[4];
    public static double[][] temperaturas = new double[4][3];
    public static double[] medias = new double[4];

    public static void introducir_pais() {
        for (int i = 0; i < 4; i++) {
            System.out.print("Nombre del país " + (i + 1) + ": ");
            paises[i] = teclado.nextLine();
        }
    }

    public static void introducir_temperaturas() {
        for (int i = 0; i < 4; i++) {
            System.out.println("Temperaturas mensuales de " + paises[i] + ":");
            for (int j = 0; j < 3; j++) {
                System.out.print("Mes " + (j + 1) + ": ");
                temperaturas[i][j] = teclado.nextDouble();
                teclado.nextLine();
            }
        }
    }

    public static void mostrar_temperaturas() {
        System.out.println("\nTemperaturas mensuales:");
        for (int i = 0; i < 4; i++) {
            System.out.print(paises[i] + ": ");
            for (int j = 0; j < 3; j++) {
                System.out.print(temperaturas[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void medias() {
        for (int i = 0; i < 4; i++) {
            double suma = 0;
            for (int j = 0; j < 3; j++) {
                suma += temperaturas[i][j];
            }
            medias[i] = suma / 3;
        }
        System.out.println("\nTemperatura media trimestral:");
        for (int i = 0; i < 4; i++) {
            System.out.println(paises[i] + ": " + medias[i]);
        }
    }

    public static void mayor() {
        double mayor = medias[0];
        int indiceMayor = 0;

        for (int i = 1; i < 4; i++) {
            if (medias[i] > mayor) {
                mayor = medias[i];
                indiceMayor = i;
            }
        }

        System.out.println("\nPaís con mayor temperatura trimestral: " + paises[indiceMayor]);
    }

    public static void main(String[] args) {
        introducir_pais();
        introducir_temperaturas();
        mostrar_temperaturas();
        medias();
        mayor();

    }
}
