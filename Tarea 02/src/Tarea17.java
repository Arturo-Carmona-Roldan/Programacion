import java.util.Scanner;
public class Tarea17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int dia,mes,anno;

        System.out.println("Ingresa el día");
        dia = teclado.nextInt();

        System.out.println("Ingresa el mes");
        mes = teclado.nextInt();

        System.out.println("Ingresa el año");
        anno = teclado.nextInt();

        if(dia==25 && mes==12) {
            System.out.println("Es navidad!!!");
        }else{
                System.out.println("No es navidad :(");
            }

        };
    }
