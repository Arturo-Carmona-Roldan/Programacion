import java.util.*;

public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa una frase para que se codifique");
        String frase = teclado.nextLine();
        frase = frase.toUpperCase();

        System.out.print("El texto codificado es: ");
        for(int i=0;i<frase.length();i++){
            char letra = frase.charAt(i);
            int num = (int) letra;


            if(num ==90){
                num = 64;
            }
            if(num ==57){
                num =47;
            }
            if(num == 32){
                num = 31;
            }
            num++;
            char letra2 = (char)num;
            System.out.print(letra2);
        }

    }
}
