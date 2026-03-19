import java.util.*;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce una cadena de texto: ");
        String texto = teclado.nextLine();

        int letras = 0;
        int digitos = 0;
        int espacios = 0;
        int otros = 0;

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i); // obtenemos cada carácter

            if (Character.isLetter(c)) {
                letras++;
            } else if (Character.isDigit(c)) {
                digitos++;
            } else if (Character.isWhitespace(c)) {
                espacios++;
            } else {
                otros++;
            }
        }

        System.out.println("Los resultados son:");
        System.out.println("Letras: " + letras);
        System.out.println("Dígitos: " + digitos);
        System.out.println("Espacios: " + espacios);
        System.out.println("Otros caracteres: " + otros);

        teclado.close();
    }
}
