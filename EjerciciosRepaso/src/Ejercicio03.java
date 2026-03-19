import java.util.*;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre,apellido1,apellido2,DNI,dominio="@g.educaand.es";

        System.out.println("Ingresa tu nombre");
        nombre = teclado.nextLine();
        System.out.println("Ingresa tu primer apellido");
        apellido1 = teclado.nextLine();
        System.out.println("Ingresa tu segundo apellido");
        apellido2 = teclado.nextLine();
        System.out.println("Ingresa tu DNI");
        DNI = teclado.nextLine();

        String correo =nombre.substring(0,1).toLowerCase() + apellido1.substring(0,3).toLowerCase() + apellido2.substring(0,3).toLowerCase() + DNI.substring(5,8) + dominio;
        System.out.println("Correo: "+correo);
    }
}
