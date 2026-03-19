import java.util.*;

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresa un numero en hexadecimal");
        String numero = teclado.nextLine();

        if (!numero.matches("^[#][0-9a-fA-F]{0,5}")) {
            System.out.println("El numero no existe como hexadecimal");
        }else {
            System.out.println("El numero hexadecimal existe");
        }

    }
}