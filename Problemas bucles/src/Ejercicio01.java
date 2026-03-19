import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n, tot = 0, pos = 0, neg = 0;

        do {
            System.out.println("Ingresa un numero");
            n = teclado.nextInt();
            if (n !=9999){
                if( n > 0){
                    pos++;
                }else if(n<0) {
                    neg++;}
                else System.out.println("El numero 0 no es ni positivo ni negativo, ingresa otro numero");
                tot = tot + n ;
             }
        }
        while (n !=9999);
        System.out.println("Hay " + pos + " numero positivos");
        System.out.println("Hay " + neg + " numero negativos");
        System.out.println("El total es de: " + tot);
    }
}