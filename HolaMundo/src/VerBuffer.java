import  java.util.Scanner;
public class VerBuffer {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n;
        System.out.print("Ingrese el numero: ");
        System.out.println(teclado.hasNextInt());
        //el .hasNextInt mira a ver si el buffer tiene un int, si lo tiene devuelve true y sigue el programa si no lo tiene devuelve false y para
        n = teclado.nextInt();
        System.out.println("el numero es: " + n);


    }
}