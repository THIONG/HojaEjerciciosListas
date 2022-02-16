package Ejercicio6;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Empresa miEmpresa = new Empresa();
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("\n\nElige una opción");
            System.out.println("1-Añadir empleado");
            System.out.println("2-Mostrar todos los empleados");
            System.out.println("3-Buscar empleado por NIF");
            System.out.println("4-Borrar empleado");
            System.out.println("5-Salir");
            try {
                opcion = teclado.nextInt();
                switch (opcion) {
                    case 1:
                        miEmpresa.añadirEmpleado();
                        break;
                    case 2:
                        miEmpresa.mostrarEmpresa();
                        break;
                    case 3:
                        miEmpresa.buscarEmpleado();
                        break;
                    case 4:
                        miEmpresa.borrarEmpleado();
                        break;
                    case 5:
                        System.out.println("Gracias por utilizar nuestro programa!");
                        break;
                    default:
                        System.out.println("Opción no válida");
                }
            } catch (InputMismatchException ime) {
                System.out.println("Debe introducir un número");
                teclado.nextLine();
            }
        } while (opcion != 5);

    }
}