import java.util.Scanner;
public class Tarea9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double porcentaje, n, n_correctas;

        System.out.println("Ingrese el número de preguntas");
        n = teclado.nextInt();

        System.out.println("Ingrese el número de preguntas correctas");
        n_correctas = teclado.nextInt();

        porcentaje = n_correctas / n;
        if(porcentaje >= 0.9){
            System.out.println("Nivel avanzado!!!");
        }else if( porcentaje < 0.9 && porcentaje >= 0.75){
            System.out.println("Nivel intermedio");
        }else if(porcentaje >= 0.5 && porcentaje < 0.75 ){
            System.out.println("Nivel básico");
        }else if(porcentaje < 0.5){
            System.out.println("Nivel insuficiente");
        }
    }
}
