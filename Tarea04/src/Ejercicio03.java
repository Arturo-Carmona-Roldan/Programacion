import java.util.*;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);



        do{
            System.out.println("Ingresa un verbo en infinitivo o escribe no para salir del programa");
            String verbo = teclado.nextLine();
            verbo = verbo.toLowerCase();

            if(verbo.equalsIgnoreCase("no")){
                break;
            }

            if (verbo.endsWith("ar")) {
                System.out.println("El verbo es de la primera conjugacion");
            } else if (verbo.endsWith("er")) {
                System.out.println("El verbo es de la segunda conjugacion");
            } else if (verbo.endsWith("ir")) {
                System.out.println("El verbo es de la tercera conjugacion");
            } else {
                System.out.println("El verbo no esta en infinitivo ");
            }
            System.out.println();

        }while (true);
    }
}