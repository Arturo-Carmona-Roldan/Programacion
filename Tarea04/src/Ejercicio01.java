import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una palabra");
        String palabra = teclado.nextLine();
        System.out.println("Introduce una vocal");
        String vocal = teclado.nextLine();

        palabra =palabra.replaceAll("[aeiouAEIOU]",vocal);
        System.out.println(palabra);
    }
}
