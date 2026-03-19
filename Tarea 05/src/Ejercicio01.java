import java.util.*;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner tecclado = new Scanner(System.in);


        while (true) {
            System.out.println("Ingresa tu nombre de usuario");
            String nombre = tecclado.nextLine();
            if (nombre.matches("^[a-zA-Z][a-zA-Z0-9_-]{4,19}")) {
                System.out.println("El nombre de usuario es valido");
                break;
            } else {
                System.out.println("El nombre no es válido porque tiene que cumplir las siguientes normas:");
                System.out.println("1. Tiene que empezar con un carácter alfabético");
                System.out.println("2. Tiene que tener entre 5 y 20 caracteres" );
                System.out.println("3. Como caracteres especiales solo se permiten - y _");
                System.out.println();
            }
        }
    }
}
