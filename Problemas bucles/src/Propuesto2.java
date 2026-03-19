import java.util.Scanner;

public class Propuesto2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresa un número");
        int con = teclado.nextInt();
        int x = 0, y = 1, z = 0;
        System.out.print("Serie de Fibonacci: " + x + " " + y);

        while (con > 0) {
            if (z >= 1) {
                System.out.print(" " + z);
            }
            z = x + y;
            x = y;
            y = z;
            con = con - 1;
        }
    }
}