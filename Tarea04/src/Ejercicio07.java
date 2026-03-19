import java.util.*;

public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresa un número de teléfono sin poner espacios");
        String n_telefono = teclado.nextLine();
        n_telefono = n_telefono.replace(" ", "");
        int b=0;

        for (int a = 0; a < n_telefono.length(); a++) {
            int num = Character.digit(n_telefono.charAt(b), 10);
            System.out.print(num);
            if (b == 2 || b == 4 || b == 6 ) {
                System.out.print(" ");
            }
            b++;

        }
    }
}
