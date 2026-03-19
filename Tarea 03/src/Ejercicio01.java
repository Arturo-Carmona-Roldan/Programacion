import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num, aciertos = 0, k, a;
        System.out.println("Vamos a jugar a adivinar un numero aleatorio entre 0 y 10 ¿A cuantos números quieres jugar?");
        a = teclado.nextInt();

        for (int i = 0; i < a; i++) {
            num = (int) (Math.random() * 10 + 1);
            System.out.println("Ingresa tu número");
            k = teclado.nextInt();

            if (k == num) {
                System.out.println("Muy bien");
                aciertos++;
            } else if (k > 10 || k < 0) {
                System.out.println("EL numero tiene que estar entre 0 y 10");

            }else
                System.out.println("Casi lo consigues");

        }
        System.out.println("Has acertado " + aciertos + " números de " + a + " posibles");
    }
}
