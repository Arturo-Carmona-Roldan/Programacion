import java.util.*;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tu direccionIP");
        String nombre = sc.nextLine();


        if (nombre.matches("^((25[0-5]|2[0-4]\\d|1\\d{2}|0?\\d{1,2})\\.){3}(25[0-5]|2[0-4]\\d|1\\d{2}|0?\\d{1,2})$")) {
            System.out.println("La IP es correcta");
        } else {
            System.out.println("La IP es incorrecta");
        }
    }
}