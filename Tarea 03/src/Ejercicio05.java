import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String opcion;
        int tabla, errores = 0;

        do {
            System.out.println("¿Quieres practicar las tablas de multiplicar? (Introduces s para si y n para no)");
            opcion = teclado.nextLine();

            if (opcion.equals("s")) {
                System.out.println("¿Que tabla del 1 al 10 quieres practicar?");
                tabla = teclado.nextInt();
                teclado.nextLine();
                if (tabla < 1 || tabla > 10) {
                    System.out.println("El número no es valido");

                } else {
                    for (int i = 1; i < 11; i++) {
                        System.out.println("Cuanto es " + tabla + " por " + i);
                        int resultado = teclado.nextInt();
                        teclado.nextLine();
                        if (resultado == (tabla * i)) {
                            System.out.println("Es correcto!!");

                        } else {
                            System.out.println("Has fallado, la respuesta era: " + (tabla * i));
                            errores++;
                        }

                    }
                    if (errores <= 3) {
                        System.out.println("Eres apto!, solo has fallado " + errores + " de 10");
                        System.out.println();
                    } else System.out.println("No eres apto, has fallado " + errores + " de 10");
                    System.out.println();
                }
            }


        } while (!opcion.equals("n"));
    }
}
