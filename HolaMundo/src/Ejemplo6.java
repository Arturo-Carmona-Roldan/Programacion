import java.util.Scanner;
public class Ejemplo6 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String nombre, direccion;
        int edad;

        System.out.println("Ingrese el nombre: ");
        nombre = teclado.nextLine();

        System.out.print("Ingrese su edad: ");
        edad = teclado.nextInt();
                /*si no limpiamos el buffer (lo que se envia) como solo coge el numero pero no el retunr (intro)
        se salta la direccion porque en la siguiente pregunta detecta el return automaticamente */
        teclado.nextLine();
        // teclado.nextLine manda lo que queda en el buffer a la nada porque no hay ninguna variable donde mandarlo

        System.out.println("Ingrese el direccion: ");
        direccion = teclado.nextLine();

        System.out.println("Datos introducidos");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Direccion: " + direccion);

        teclado.close();
    }
}
