import java.util.Scanner;

public class Tarea11 {
    public static void main(String[] args) {
        double  preciof,anterior, actual, total;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresa el valor de la lecura anterior en Kw");
        anterior = teclado.nextInt();
        System.out.println("Ingresa el valor de la lecura actual en Kw");
        actual = teclado.nextInt();
        total = actual - anterior;

        if (total > 250) {
            preciof = ((total - 250) * 0.15) + 60.6;
            System.out.println("Tienes que pagar " + preciof + "€");
        }else if (total > 100 && total <= 250){
            preciof = ((total-100) * 0.20 ) + 30.6;
            System.out.println("Tienes que pagar " + preciof + "€");
        }else if(total <=100){
            preciof = total * 0.3 + 0.6;
            System.out.println("Tienes que pagar " + preciof + "€");
        }else if(total == 0){
            preciof = 0.6;
            System.out.println("Tienes que pagar " + preciof + "€");
        }
    }
}