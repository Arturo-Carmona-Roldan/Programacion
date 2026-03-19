import java.util.*;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int aforo = 100, entradas, precio = 25, precio2,preciototal=0,entradasf=0;
        String opcion = "";

        do {
            System.out.println("¿Quiere comprar entradas para el concierto? (Responde con s para si y n para no)");
            opcion = teclado.nextLine();
            opcion = opcion.toLowerCase();
            if (opcion.equals("s")) {

                do {
                    System.out.println("Ingresa en número de entradas que quieres comprar");
                    entradas = teclado.nextInt();
                    if (entradas > 10) {
                        System.out.println("Solo puedes comrar 10 entradas de una");
                    }
                    if (entradas >aforo) {
                        System.out.println("No puedes comprar " + entradas + " entradas porque solo quedan " + aforo + " entradas");
                    }


                } while (entradas > 10 || entradas > aforo);



                aforo = aforo - entradas;
                precio2 = entradas * precio;
                entradasf = entradasf + entradas;

                System.out.println("El precio de la compra por ahora es de: " + precio2 + "€");
                System.out.println("Quedan " + aforo + " entradas a la venta ");
                System.out.println();
                teclado.nextLine();

                if (aforo == 0) {
                    System.out.println("Ya no quedan entradas disponibles que se puedan comprar");
                    break;
                }

            }


        } while (!opcion.equals("n"));
    }
}
