import java.util.*; //el * hace que importe todas las clases posibles a la vez
import java.text.NumberFormat; // importa el formato del idioma del sistema operativo (en este caso español)
public class PrintF {
    public static void main(String[] args) {
        //d es para numeros, f es para decimales y s es para strings
        //el %n hace un intro y salta a la siguiente linea

        long n = 461012;


        System.out.format("%d%n", n);
        System.out.format("%08d%n", n);
        System.out.format("%+8d%n", n);
        System.out.format("%,8d%n", n);
        System.out.format("%+,8d%n%n", n);
        //el primer 0 a la izquierda hace que se rellene con 0 delante del numero, el 8 son el numero de caracteres que caben (los que sobran se rellenan con ceros si esta el 0)
        //si pones un menos donde el 0, el texto se justifica a la izquierda


        double pi = Math.PI;

        System.out.format("%f%n", pi);
        System.out.format("%.3f%n", pi);
        System.out.format("%10.3f%n", pi);
        System.out.format("%-10.3f%n", pi);
        //el punto y el numero de detras es el numero de decimales que quiere mostrar


        String d="cipote";

        System.out.printf("%20.5s%n",d);
        //aqui el 20 es el numero de caracteres en blanco antes de la palabra y el 5 el numero de caracteres que se rellenan


        Calendar c = Calendar.getInstance();

        System.out.format("%te de %tB de %tY%n", c, c, c); //%te es el dia, %tB es el mes escrito en letras y %tY es el año
        System.out.format("%tl:%tM %tp%n", c, c, c);    // %tl es la hora (0-12) %tM son los minutos y %tp pone si es pm o am
        System.out.format("%td/%tm/%ty%n", c, c, c);    // %tm es el mes escrito en numero y %ty es solo los 2 ultimos numeros del año

        NumberFormat miformato = NumberFormat.getCurrencyInstance(); //hay que crear este elemento para poder usar el formato importado arriba
        double importe=1389.98;
        System.out.println("El importe es: " + miformato.format(importe));  //Esto importa el formato al numero, en este caso pone un punto en los miles y la coma en los decimales
    }
}
