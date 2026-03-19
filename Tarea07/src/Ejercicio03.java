import java.util.*;

public class Ejercicio03 {
    public static String[] paises = new String[5];
    public static int[] habitantes = new int[5];
    public static Scanner teclado = new Scanner(System.in);

    public static void Insertar_nombres() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingresa el nombre de un pais");
            paises[i] = teclado.nextLine();
        }
    }

    public static void Insertar_habitantes() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingresa el número de habitantes del pais " + paises[i] + ": ");
            habitantes[i] = teclado.nextInt();
        }
    }

    public static void Orden_alfabetico() {
        Arrays.sort(paises);
        System.out.println("\n -- Paises ordenados alfabeticamente --");
        for (int i = 0; i < paises.length; i++) {
            System.out.println(paises[i]);
        }
    }

    public static void Orden_mayormenos() {
        System.out.println("\n -- Paises ordenados de mayor a menor por numero de habitantes --");

        for (int i = 0; i < habitantes.length - 1; i++) {
            for (int j = 0; j < habitantes.length - 1 - i; j++) {

                if (habitantes[j] < habitantes[j + 1]) {

                    int auxHab = habitantes[j];
                    habitantes[j] = habitantes[j + 1];
                    habitantes[j + 1] = auxHab;

                    String auxPais = paises[j];
                    paises[j] = paises[j + 1];
                    paises[j + 1] = auxPais;
                }
            }
        }

        for (int i = 0; i < paises.length; i++) {
            System.out.println(paises[i] + " → " + habitantes[i] + " habitantes");
        }
    }

    public static void main(String[] args) {
        Insertar_nombres();
        Insertar_habitantes();
        Orden_alfabetico();
        Orden_mayormenos();
    }
}
