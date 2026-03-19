import java.util.Scanner;

public class Tarea12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double euros, centimos;
        int resto;

        System.out.println("Ingresa la cantidad de dinero en euros");
        euros = teclado.nextDouble();
        centimos = euros * 100;

        int cincuenta = (int) centimos / 50;
        int veinte = (int) (centimos % 50) / 20;
        int diez = (int) ((centimos % 50) % 20) / 10;
        int cinco = (int) (((centimos % 50) % 20) % 10) / 5;
        int dos = (int) ((((centimos % 50) % 20) % 10) % 5) / 2;
        int uno = (int) (((((centimos % 50) % 20) % 10) % 5) % 2) /1;

        System.out.println("Hay " + cincuenta + " monedas de 50 centimos");
        System.out.println("Hay " + veinte + " monedas de 20 centimos");
        System.out.println("Hay " + diez + " monedas de 10 centimos");
        System.out.println("Hay " + cinco + " monedas de 5 centimos");
        System.out.println("Hay " + dos + " monedas de 2 centimos");
        System.out.println("Hay " + uno + " monedas de 1 centimo");
    }
}

