import java.util.Scanner;
public class IntroducirNumero {
    public static void main(String[] args) {
        double x;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Dame un numero: ");
        x=teclado.nextDouble();
        System.out.println(x);

        teclado.close();
    }
}