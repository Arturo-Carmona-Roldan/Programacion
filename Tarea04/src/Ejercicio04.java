import javax.management.monitor.StringMonitorMBean;
import java.io.File;
import java.util.*;
public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresa la ruta absoluta en la que se encuentra un fichero ");
        String ruta = teclado.nextLine();

        int n_letras = ruta.length();

        String direcctorio= ruta.substring(0,ruta.lastIndexOf("/"));
        String nombre = ruta.substring(ruta.lastIndexOf("/")+1,n_letras);

        System.out.println("El nombre del archivo es: "+nombre);
        System.out.println("La ruta absoluta es: "+direcctorio) ;
    }
}
