import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce tu nombre");
        String nombre = teclado.nextLine();
        System.out.println("Introduce tu primer apellido");
        String apellido = teclado.nextLine();
        System.out.println("Introduce tu segundo apellido");
        String segundo = teclado.nextLine();

        nombre = nombre.substring(0, 1).toUpperCase();
        apellido = apellido.substring(0, 1).toUpperCase();
        segundo = segundo.substring(0, 1).toUpperCase();

        System.out.println(nombre + "." + apellido + "." + segundo);

    }
}
