import java.util.Scanner;

public class Tarea5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre;
        String direccion;
        String telefono;

        System.out.println("Escribe tu nombre: ");
        nombre = teclado.nextLine();
        System.out.println("Tu nombre es: " + nombre);

        System.out.println("Escribe tu direccion: ");
        direccion = teclado.nextLine();
        System.out.println("Tu direccion es: " + direccion);

        System.out.println("Escribe tu telefono: ");
        telefono = teclado.nextLine();
        System.out.println("Tu telefono es: " + telefono);
    }
}
