import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        int bas, exp, res = 1;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresa la base de la potencia");
        bas = teclado.nextInt();
        System.out.println("Ingresa el exponente de la potencia");
        exp = teclado.nextInt();

        if (exp == 0) {
            System.out.println("Cualquier numero elevado a 0 es igual a 1");
        } else if (exp == 1) {
            System.out.println(bas + " elevado a " + exp + " es igual a: " + bas);
        } else if (exp == -1) {
            System.out.println(bas + " elevado a " + exp + " es igual a: 1/" + bas);
        } else if (exp > 0) {
            for (int i = 0; i < exp; i++) {
                res = res * bas;

            }
            System.out.println(bas + " elevado a " + exp + " es igual a: " + res);

        } else if (exp < 0) {
            for (int i = exp; i < 0; i++) {
                res = res * bas;

            }
            System.out.println(bas + " elevado a " + exp + " es igual a: 1/" + res);
        }
    }
}



