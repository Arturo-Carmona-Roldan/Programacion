import java.util.Scanner;

public class Tarea04 {

    private String frase,letraFrase;

    public void Imprimir(String frase) {
        System.out.println("La frase mide " + frase.length() + " caracteres");
    }

    public void sustituir(String NuevaFrase, String letra) {
        NuevaFrase = frase.replace(letra, "*");
        System.out.println(NuevaFrase);
    }

    public void invertir() {

            String frasenueva = "";
            int inicio = 0;

            for (int i = 0; i <= frase.length(); i++) {
                if (i == frase.length() || frase.charAt(i) == ' ') {
                    for (int j = i - 1; j >= inicio; j--) {
                        for (int k = j; k == j; k++) {
                            frasenueva += frase.charAt(k);
                        }
                    }
                    if (i < frase.length()) {
                        frasenueva += " ";
                    }
                    inicio = i + 1;
                }
            }

            System.out.println(frasenueva);


    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Tarea04 tarea = new Tarea04();

        while (true) {
            System.out.println("Introduce una frase (* para salir): ");
            tarea.frase = teclado.nextLine();

            if (tarea.frase.equals("*")) {
                break;
            }

            System.out.println("Introduce una letra de la frase a reemplazar: ");
            tarea.letraFrase = teclado.nextLine();

            tarea.Imprimir(tarea.frase);
            tarea.sustituir(tarea.frase, tarea.letraFrase);

            System.out.print("Frase invertida palabra por palabra: ");
            tarea.invertir();

            System.out.println();

        }
    }
}