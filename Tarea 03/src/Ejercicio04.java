import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num = 0, k = 0, a, intentos = 0;
        num = (int) (Math.random() * 100 + 1);

        do {
            System.out.println("Di el número que crees que es:");
            k = teclado.nextInt();
            a = Math.abs(k - num);

            if (a >= 50) {
                System.out.println("Muy frio");
                intentos++;
            } else if (a >= 10) {
                System.out.println("Frio");
                intentos++;
            } else if (a >= 5) {
                System.out.println("Caliente");
                intentos++;
            } else if (a >= 1)
                System.out.println("Muy caliente");
            intentos++;

        } while (k != num);
        System.out.println("Has acertado en " + intentos + " intentos!!");
    }
}
