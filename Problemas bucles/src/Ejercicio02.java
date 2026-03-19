import java.util.Scanner;
public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n, dig = 0;

        System.out.println("Ingrese un numero: ");
        n = teclado.nextInt();
        do {
            n = n/10;
            dig++;
        }
        while (n >= 1);
        System.out.println("El número de dígitos es de: " + dig);
    }
}
