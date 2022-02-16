package Ejercicio5;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List <Empleado> empleados = new ArrayList();
        Scanner sc = new Scanner(System.in);
        String nombre, nif;
        Empleado empls;
        double sueldo;
        int opcion;
        do {
            System.out.println("1.- Añadir empleado");
            System.out.println("2.- Mostrar empleados empresa");
            System.out.println("3.- Buscar empleado por NIF");
            System.out.println("4.- Borrar empleado por NIF");
            System.out.println("5.- Salir");
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion){
                case 1:
                    System.out.println("Introduzca el NIF del empleado: ");
                    nif = sc.nextLine();
                    System.out.println("Introduzca el nombre del empleado: ");
                    nombre = sc.nextLine();
                    System.out.println("Introduzca el sueldo del empleado: ");
                    sueldo = sc.nextDouble();
                    empleados.add(new Empleado(nif, nombre, sueldo));
                    break;
                case 2:
                    System.out.println(empleados.toString());
                    break;
                case 3:
                    System.out.println("Introduzca el NIF para buscar dicho empleado: ");
                    nif = sc.nextLine();
                    Iterator it = empleados.iterator();
                    while (it.hasNext()) {
                        empls = (Empleado) it.next();
                        if (empls.getNif().equals(nif)) {
                            System.out.println(empls.toString());
                        } else {
                            System.out.println("No se ha podido encontrar dicho NIF, introduzcalo de nuevo...");
                        }
                    }

                    break;
                case 4:
                    System.out.println("Introduzca el NIF para borrar dicho empleado: ");
                    nif = sc.nextLine();
                    it = empleados.iterator();
                    while (it.hasNext()) {
                        empls = (Empleado) it.next();
                        if (empls.getNif().equals(nif)) {
                            System.out.println("El empleado ha sido removido del programa...");
                            it.remove();
                        } else {
                            System.out.println("No se ha podido enonctrar dicho NIF, introduzcalo de nuevo...");
                        }
                    }
                    break;
                case 5:
                    System.out.println("Gracias por utilizar nuestro programa!");
                    break;
                default:
                    System.out.println("Opcion invalida, introduzca otra opcion de nuevo...");
                    break;
            }
        }while(opcion != 5);
    }
}