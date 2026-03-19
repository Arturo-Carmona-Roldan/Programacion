import java.util.*;

public class EjercicioReversa {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un texto: ");
        String texto = teclado.nextLine();

        String invertido = "";

        for (int i = texto.length() - 1; i >= 0; i--) {
            invertido += texto.charAt(i);
        }

        System.out.println("Texto invertido: " + invertido);

        teclado.close();
    }
}
