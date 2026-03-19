import java.util.Scanner;

public class Tarea2 {
    public static void main(String[] args) {
        int x, y;
        Scanner teclado1 = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in);

        System.out.println("Ingrese el valor de x");
        x = teclado1.nextInt();
        System.out.println("Ingrese el valor de y");
        y = teclado2.nextInt();

        System.out.println("X vale: " + x);
        System.out.println("Y vale: " + y);
        System.out.println("X + y es igual a: " + (x + y));
        System.out.println("X - y es igual a: " + (x - y));
        System.out.println("X / y es igual a: " + (x / y));
        System.out.println("X * y es igual a: " + (x * y));
    }
}
