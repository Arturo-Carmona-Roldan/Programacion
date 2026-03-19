import java.util.Scanner;

public class Propuesto1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dame un numero");
        double con = teclado.nextInt();
        double  res = 0, a = 1;

        while (con > 0) {
            res = res + (1 / a);
            a = a + 1;
            con = con - 1;
        }
        System.out.println("El resultado es: " + res);
    }
}

