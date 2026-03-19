import java.util.Arrays;

public class Ejercicio01 {
    public static void main(String[] args) {
        int[] valores= new int [8];

        valores[0] = (int)(Math.random()*100 + 1);
        valores[1] = (int)(Math.random()*100 + 1);
        valores[2] = (int)(Math.random()*100 + 1);
        valores[3] = (int)(Math.random()*100 + 1);
        valores[4] = (int)(Math.random()*100 + 1);
        valores[5] = (int)(Math.random()*100 + 1);
        valores[6] = (int)(Math.random()*100 + 1);
        valores[7] = (int)(Math.random()*100 + 1);

        int suma=0,suma2=0,cont=0;
        System.out.println("Valores: " + Arrays.toString(valores));
        for (int i=0; i<valores.length; i++){
         suma += valores[i];
        }
        System.out.println("La suma de los valores es igual a: "+suma);

        for (int j=0; j<valores.length; j++){
            if (valores[j]>36){
                suma2 +=valores[j];
            }
        }
        System.out.println("La suma de los valores mayores a 36 es de: " + suma2);

        for (int k=0; k<valores.length; k++){
            if (valores[k]>50){
                cont +=1;
            }
        }
        System.out.println("Hay " + cont + " valores mayores de 50");

    }
}
