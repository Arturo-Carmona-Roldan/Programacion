import java.util.Scanner;

public class MayorMenor1 {

    private int n1, n2, n3;

    public MayorMenor1(int a, int b, int c) {
        n1 = a;
        n2 = b;
        n3 = c;
    }

    public void mayor() {
        int m = 0;
        if (n1 > n2 && n1 > n3) {
            m = n1;
        } else if (n2 > n1 && n2 > n3) {
            m = n2;
        } else {
            m = n3;
        }
        System.out.println("El mayor es: " + m);
    }

    public void menor() {
        int n = 0;
        if (n1 < n2 && n1 < n3) {
            n = n1;
        } else if (n2 < n1 && n2 < n3) {
            n = n2;
        } else {
            n = n3;
        }
        System.out.println("El menor es: " + n);
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n1, n2, n3;
        System.out.println("Introduce el primer numero");
        n1 = teclado.nextInt();
        System.out.println("Introduce el segundo numero");
        n2 = teclado.nextInt();
        System.out.println("Introduce el tercer numero");
        n3 = teclado.nextInt();
        MayorMenor1 numero = new MayorMenor1(n1, n2, n3);
        numero.menor();
        numero.mayor();
    }
}
