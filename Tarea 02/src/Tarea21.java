import java.util.Scanner;

public class Tarea21 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int x, y;

        System.out.println("Dame la primera coordenada");
        x = teclado.nextInt();
        System.out.println("Dame la segunda coordenada");
        y = teclado.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("Pertenece al primer cuadrante");
        } else if (x < 0 && y > 0) {
            System.out.println("Pertenece al segundo cuadrante");

        } else if (x < 0 && y < 0) {
            System.out.println("Pertenece al tercer cuadrante");

        } else if (x > 0 && y < 0) {
            System.out.println("Pertenece al cuarto cuadrante");

        }

    }
}