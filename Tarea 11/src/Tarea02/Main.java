package Tarea02;

import java.util.*;

public class Main {
    private static String opcion;
    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        Persona persona = new Persona("Pepe", "Perez", "12345678A", "Soltero");
        System.out.println(persona.toString());
        System.out.println();

        Estudiante estudiante = new Estudiante("Juan", "Perez", "87654321A", "Soltero", "1º Bachillerato");
        System.out.println(estudiante.toString());
        System.out.println();

        Profesor profesor = new Profesor("Maria", "Garcia", "12344321A", "Casada", "2020", "123456", "Informatica");
        System.out.println(profesor.toString());
        System.out.println();

        Personal personal = new Personal("Ana", "Lopez", "87655678A", "Viuda", "2020", "123456", "Zona 1");
        System.out.println(personal.toString());
        System.out.println();

        Empleado empleado = new Empleado("Juan", "Perez", "87654321A", "Soltero", "2020", "123456");
        System.out.println(empleado.toString());
        System.out.println();


        while (!opcion.equals("0")){
            System.out.println("1. Cambiar estado civil de una persona.");
            System.out.println("2. Reasignación de número de trabajador a un empleado.");
            System.out.println("3. Matriculación de un estudiante en un nuevo curso.");
            System.out.println("4. Cambio de departamento de un profesor. ");
            System.out.println("5. Traslado de zona de un empleado del personal de servicio.");
            System.out.println("6. Imprimir toda la información de cada tipo de individuo.");
            System.out.println("0. Salir.");
            System.out.print("\nElige una opción: ");
            opcion = teclado.nextLine();
            System.out.println();
            switch (opcion){
                case "1":
                    System.out.print("Escribe el nuevo estado civil: ");
                    persona.setEstado_civil(teclado.nextLine());
                    break;
                case "2":
                    System.out.print("Escribe el nuevo número de trabajador: ");
                    empleado.setNumero_asociado(teclado.nextLine());
                    break;
                case "3":
                    System.out.print("Escribe la nueva matricula: ");
                    estudiante.setCurso(teclado.nextLine());
                    break;
                case "4":
                    System.out.print("Escribe el nuevo departamento: ");
                    profesor.setDepartamento(teclado.nextLine());
                    break;
                case "5":
                    System.out.print("Escribe la nueva zona: ");
                    personal.setZona(teclado.nextLine());
                    break;
                case "6":
                    System.out.println(persona);
                    System.out.println();
                    System.out.println(estudiante);
                    System.out.println();
                    System.out.println(empleado);
                    System.out.println();
                    System.out.println(profesor);
                    System.out.println();
                    System.out.println(personal);
                    break;
                case "0":
                    break;
            }
            if(!opcion.equals("0")){
                System.out.println("1. Cambiar estado civil de una persona.");
                System.out.println("2. Reasignación de número de trabajador a un empleado.");
                System.out.println("3. Matriculación de un estudiante en un nuevo curso.");
                System.out.println("4. Cambio de departamento de un profesor. ");
                System.out.println("5. Traslado de zona de un empleado del personal de servicio.");
                System.out.println("6. Imprimir toda la información de cada tipo de individuo.");
                System.out.println("0. Salir.");
                System.out.print("\nElige una opción: ");
                opcion = teclado.nextLine();
                System.out.println();
            }
        }

    }
}