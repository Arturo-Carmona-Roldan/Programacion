import java.util.*;
public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresa una frase con las palabras separadas por espacios");
        String frase = teclado.nextLine();

        frase = frase.trim();

        if (frase.isEmpty()){
            System.out.println("La frase no contiene ninguna palabra");
        }else {
            String[] palabra = frase.split("[\\s,;:.!?]+");

            System.out.println("EL numero de palabras de la frase es de: " + palabra.length);
        }

    }
}
