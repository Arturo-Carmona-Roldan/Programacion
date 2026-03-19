import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a, b;

        System.out.println("Version con while");
        a = 0;
        b = 0;
        while (a < 7) {
            System.out.println(a + " " + b);
            a++;
            b += 2;
        }
        System.out.println("---------------------");

        System.out.println("Version con do while");
        a = 0;
        b = 0;
        do {

            System.out.println(a + " " + b);
            a++;
            b = b + 2;

        } while (a < 7);


    }
}
