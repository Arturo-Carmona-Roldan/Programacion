import java.util.*;

public class Ejercicio05 {
    static Scanner teclado = new Scanner(System.in);
    static String[] encuestadores;
    static int[] dia1, dia2, dia3, total;
    static boolean[] premio100;
    static int ganador200;

    public static void carga() {
        encuestadores = new String[5];
        dia1 = new int[5];
        dia2 = new int[5];
        dia3 = new int[5];

        for (int i = 0; i < encuestadores.length; i++) {
            System.out.print("Introduce el nombre: ");
            encuestadores[i] = teclado.nextLine();
            dia1[i] = (int) (Math.random() * (500 + 1));
            dia2[i] = (int) (Math.random() * (500 + 1));
            dia3[i] = (int) (Math.random() * (500 + 1));
        }
    }

    public static void premio200() {
        total = new int[5];
        int mayor;
        for (int i = 0; i < dia1.length; i++) {
            total[i] = dia1[i] + dia2[i] + dia3[i];
        }
        mayor = total[0];
        ganador200 = 0;
        for (int i = 0; i < total.length; i++) {
            if (total[i] > mayor) {
                mayor = total[i];
                ganador200 = i;
            }
        }
    }

    public static void premio100() {
        premio100 = new boolean[5];
        for (int i = 0; i < dia1.length; i++) {
            if (dia1[i] > 100 && dia2[i] > 100 && dia3[i] > 100) {
                premio100[i] = true;
            } else {
                premio100[i] = false;
            }
        }

    }

    public static void imprimir() {
        for (int i = 0; i < encuestadores.length; i++) {
            int premio = 0;
            System.out.println("\nNombre: " + encuestadores[i]);
            System.out.println("Encuesta dia 1: "  + dia1[i] + " - Encuesta dia 2: " + dia2[i] + " - Encuesta dia 3: " + dia3[i]);
            System.out.println("Dinero por las encuestas realizadas: " + total[i] + " €");
            if (ganador200 == i) {
                premio = 200;
            }
            if (premio100[i]) {
                premio += 100;
            }
            System.out.println("Dinero por los premios: " + premio);
        }

    }

    public static void main(String[] args) {
        carga();
        premio200();
        premio100();
        imprimir();
    }

}
