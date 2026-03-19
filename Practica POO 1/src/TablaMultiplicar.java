import java.util.Scanner;

public class TablaMultiplicar {

    private int n1;

    public TablaMultiplicar(int a) {
        n1 = a;
    }

    public void setn1(int a) {
        n1 = a;
    }

    public void tabla() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n1 + " * " + i + " = " + n1 * i);
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n1;
        TablaMultiplicar t1 = new TablaMultiplicar(0);

        do {
            System.out.println("\nIngresa un numero para calcular su tabla (-1 para salir):");
            n1 = teclado.nextInt();

            if (n1 != -1) {
                t1.setn1(n1);
                t1.tabla();
            }

        } while (n1 != -1);

    }
}