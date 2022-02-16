package Ejercicio4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List <Empleado> empleadosArray = new ArrayList<Empleado>();
        Empleado empleado;
        Scanner sc = new Scanner(System.in);
        String nombre;
        boolean salir = false;
        char caracter = 'S';
        int sueldo;

        do {
            if (caracter == 's' || caracter == 'S') {
                System.out.println("Introduzca el nombre del empleado: ");
                nombre = sc.nextLine();
                System.out.println("Introduzca el sueldo del empleado: ");
                sueldo = sc.nextInt();
                empleadosArray.add(new Empleado(nombre,sueldo));

                System.out.println("Desea insertar más empleados? S/n");
                caracter = sc.next().charAt(0);
                sc.nextLine();
            }
            if (caracter == 'n' || caracter == 'N') {
                salir = true;
            }
        }while(!salir);

        System.out.println("Mostramos todos los empleados añadidos: ");
        Iterator it = empleadosArray.listIterator();
        while (it.hasNext()) {
            empleado = (Empleado) it.next();
            System.out.println(empleado.toString());
        }

        System.out.println("Introduzca un sueldo para borrar todos los menores a él: ");
        sueldo = sc.nextInt();
        it = empleadosArray.iterator();
        while(it.hasNext()){
            empleado = (Empleado) it.next();
            if (empleado.getSueldo() < sueldo){
                it.remove();
            }
        }

        System.out.println("Mostramos despues de borrar: ");
        it = empleadosArray.listIterator();
        while (it.hasNext()) {
            empleado = (Empleado) it.next();
            System.out.println(empleado.toString());
        }
    }
}
