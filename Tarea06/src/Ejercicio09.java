import java.util.*;

public class Ejercicio09 {
    public static Scanner teclado = new Scanner(System.in);
    public static int[] dias_mes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static int dia, mes, anio;

    public static void introducirFecha() {
        System.out.print("Introduce el día: ");
        dia = teclado.nextInt();
        System.out.print("Introduce el mes: ");
        mes = teclado.nextInt();
        System.out.print("Introduce el año: ");
        anio = teclado.nextInt();
    }

    public static boolean esBisiesto(int anio) {
        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
    }

    public static int diasDelAnio() {
        int total = 0;
        for (int d : dias_mes) total += d;
        return total;
    }

    public static void diasRestantes() {
        if (esBisiesto(anio)) dias_mes[1] = 29;
        else dias_mes[1] = 28;

        int diasPasados = 0;
        for (int i = 0; i < mes - 1; i++) {
            diasPasados += dias_mes[i];
        }
        diasPasados += dia;

        int total = diasDelAnio();
        int diasRestantes = total - diasPasados;

        System.out.println("Para que acabe el año quedan " + diasRestantes + " días.");
    }

    public static void main(String[] args) {
        introducirFecha();
        diasRestantes();
    }
}
