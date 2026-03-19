import java.util.*;
public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String texto1,texto2;

        do {
            do {
                System.out.println("Ingresa un texto");
                texto1 = teclado.nextLine();
                System.out.println("Ingresa un texto mas largo que el anterior");
                texto2 = teclado.nextLine();

                if(texto1.length() >= texto2.length()){
                    System.out.println("El segundo texto tiene que ser mas largo que el primero");
                }

            }while(texto1.length() >= texto2.length());

            texto1 = texto1.toUpperCase();
            texto2 = texto2.toUpperCase();

            if(!texto2.contains(texto1)){
                System.out.println("El segundo texto tiene que contener en alguna parte el primero");
            }

        }while(!texto2.contains(texto1));
        System.out.println("Bien, el segundo texto contiene el primero");

    }
}
