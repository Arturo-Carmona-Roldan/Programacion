package Tarea01;

import java.util.ArrayList;
import java.util.Scanner;

public class Taller {
    public static ArrayList<Ordenador> estado0 = new ArrayList<Ordenador>();
    public static ArrayList<Ordenador> estado1 = new ArrayList<Ordenador>();
    public static ArrayList<Ordenador> estado2 = new ArrayList<Ordenador>();
    public static String opcion;
    private static Scanner teclado = new Scanner(System.in);
    public static double presupuesto;

    public static void setPresupuesto(double presupuesto) {
        Taller.presupuesto = presupuesto;
    }

    public static void getGarantia() {
        System.out.print("Introduce el código de reparación: ");
        String codigo_reparacion = teclado.nextLine();
        System.out.print("Introduce el código del cliente: ");
        String codigo_cliente = teclado.nextLine();
        System.out.print("Introduce la descripción: ");
        String descripcion = teclado.nextLine();
        System.out.println("¿Tienes garantía? (S/N)");
        opcion = teclado.nextLine();
        while (!opcion.equalsIgnoreCase("S") && !opcion.equalsIgnoreCase("N")) {
            System.out.println("Introduce S o N");
            opcion = teclado.nextLine();
        }
        if (opcion.equalsIgnoreCase("S")) {
            System.out.println("Introduce la fecha de compra (dd/MM/yyyy)");
            String fechaCompra = teclado.nextLine();
            Garantia g = new Garantia(codigo_reparacion, codigo_cliente, descripcion, fechaCompra);
            estado1.add(g);
            Taller.setPresupuesto(0);

        } else {
            Ordenador o = new Ordenador(codigo_reparacion, codigo_cliente, descripcion);
            estado0.add(o);
            System.out.println("Introduce el presupuesto");
            double presupuesto = teclado.nextDouble();
            Taller.setPresupuesto(presupuesto);
            System.out.println("¿El cliente ha aceptado el presupuesto?");
            if (teclado.nextLine().equalsIgnoreCase("si")) ;
            {
                estado0.remove(o);

            }
        }


    }


    public static void main(String[] args) {

    }
}