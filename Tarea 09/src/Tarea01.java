import java.util.Scanner;

public class Tarea01 {
    private static int n1;

    public static void pedirnum(int n) {
        n1 = n;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Di el número de asteriscos que quieras a imprimir");
        n1 = teclado.nextInt();

        for (int i = n1; i > 0; i--) {
            System.out.print("*");
        }
    }

    public static void main(String[] args) {
        pedirnum(n1);
    }
}
