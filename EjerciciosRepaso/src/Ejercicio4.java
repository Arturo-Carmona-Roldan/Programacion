import java.util.*;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String palabra;

        do {
            System.out.println("Ingresa una palabra de 10 letras como máximo");
            palabra = teclado.nextLine();
            if (palabra.length() > 10) {
                System.out.println("La palabra tiene que tener 10 letras como máximo");
            }

        }while(palabra.length()>10);

        for(int i=1;i<=palabra.length();i++) {
            System.out.print(palabra.substring(0, i));
            System.out.println();
        }
    }
}
