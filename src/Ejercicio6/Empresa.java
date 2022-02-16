package Ejercicio6;

import java.util.*;

public class Empresa {
    static ArrayList <Empleado> empresa = new ArrayList ();

    public static void añadirEmpleado() {
        Scanner sc = new Scanner(System.in);
        boolean valido = true;
        String nif, nombre;
        double sueldo = 0;

        System.out.println("Introduce NIF");
        nif = sc.nextLine();
        System.out.println("Introduce nombre");
        nombre = sc.nextLine();
        System.out.println("Introduce sueldo");
        do{
            try{
                sueldo = sc.nextDouble();
                valido = true;
            }catch(InputMismatchException ime){
                System.out.println("Cantidad no válida");
                valido = false;
                sc.nextLine();
            }
        }while(!valido);
        Empleado emp = new Empleado(nif, nombre, sueldo);
    }

    public static void mostrarEmpresa(){
        if (empresa.size() == 0) {
            System.out.println("No hay empleados en la lista");
        }
        for (Empleado empleado : empresa) {
            System.out.println(empleado.toString());
        }
    }

    public static void buscarEmpleado(){
        Scanner sc = new Scanner(System.in);
        boolean encontrado = false;
        String nif;

        System.out.println("Introduce NIF de empleado a buscar");
        nif = sc.nextLine();
        for (Empleado e : empresa) {
            if (e.getNif().equals(nif)) {
                System.out.println("El empleado es: ");
                System.out.println(e.toString());
                encontrado = true;
            }

        }
        if (encontrado == false) {
            System.out.println("No se ha encontrado el empleado con NIF " + nif);
        }
    }

    public static void borrarEmpleado(){
        Scanner teclado = new Scanner(System.in);
        Boolean encontrado = false;
        String nif;

        System.out.println("Introduce NIF de empleado a borrar");
        nif = teclado.nextLine();
        Iterator<Empleado> it = empresa.iterator();
        while (it.hasNext()) {
            Empleado empleado = it.next();
            if (nif.equals(empleado.getNif())) {
                it.remove();
                encontrado = true;
            }
        }
        if (encontrado == false) {
            System.out.println("No se ha encontrado el empleado con NIF " + nif);
        } else {
            System.out.println("....Borrado empleado con NIF " + nif);
        }
    }
}
