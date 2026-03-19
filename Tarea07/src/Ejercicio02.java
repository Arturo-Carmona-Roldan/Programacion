import java.util.*;

public class Ejercicio02 {
    public static double[] cursoA = new double[5];
    public static double[] cursoB = new double[5];
    public static Scanner teclado = new Scanner(System.in);
    public static double promedioA = 0, promedioB = 0;

    public static void Introducir_notasA() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce la nota del " + (i + 1) + "º alumno del curso A");
            cursoA[i] = teclado.nextDouble();
            teclado.nextLine();
        }
    }

    public static void Introducir_notasB() {
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce la nota del " + (i + 1) + "º alumno del curso B");
            cursoB[i] = teclado.nextDouble();
            teclado.nextLine();
        }
    }

    public static void PromedioA() {
        for (int i = 0; i < 5; i++) {
            promedioA = promedioA + cursoA[i];
        }
        promedioA = promedioA / 5;
    }

    public static void PromedioB() {
        for (int i = 0; i < 5; i++) {
            promedioB = promedioB + cursoB[i];
        }
        promedioB = promedioB / 5;
    }

    public static void print() {
        System.out.println("El promedio de la case A es: " + promedioA);
        System.out.println("El promedio de la case B es: " + promedioB);

        if (promedioA > promedioB) {
            System.out.println("El mayor promedio es de la clase A");
        }else if(promedioA < promedioB) {
            System.out.println("El mayor promedio es de la clase B");
        }else {
            System.out.println("Las dos clases tienen el mismo promedio");
        }
    }

    public static void main(String[] args) {
        Introducir_notasA();
        Introducir_notasB();
        PromedioA();
        PromedioB();
        print();
    }
}
