import java.util.*;

public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresa la frase que quieras");
        String frase = teclado.nextLine();

        if (frase.isEmpty()) {
            System.out.println("Lla frase no contienne ninguna palabra");

        }else {
            String[] palabra = frase.split("[\\s,;:.!?]+");

            String masLarga= " ";
            int nletras = 0;

            for (String palabra1 : palabra) {
                if (nletras < palabra.length){
                    masLarga = palabra1;
                    nletras = palabra1.length();
                }
            }
            System.out.println("La palabra mas larga es: "+masLarga + " y tiene " + nletras + " letras");
        }
    }
}