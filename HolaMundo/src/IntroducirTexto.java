import java.util.Scanner;
public class IntroducirTexto {
    public static void main(String[] args) {
        String x;
        String y;
        Scanner teclado=new Scanner(System.in);
        System.out.print("Ingrese tu nombre y apellido: ");
        x=teclado.nextLine();
        //nextLine coge la linea entera aunque sean varias palabras separadas y next coge palabra por palabra
        y=teclado.next();
        System.out.println(x);
        System.out.println(y);
    }
}
