import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int caras = 0, cruces = 0, tiradas = 0, n, caras_seguidas = 0;

        do {
            n = (int) (Math.random() * 2 + 1);
            tiradas++;
            if (n % 2 == 0) {
                System.out.println("Ha sido cara");
                caras++;
                caras_seguidas++;
            } else {
                System.out.println("Ha sido cruz");
                cruces++;
                caras_seguidas = 0;
            }

        } while (caras_seguidas < 3);
        System.out.println("Han sido " + caras + " caras" + " y " + cruces + " cruces en " + tiradas + " tiradas");
    }
}
