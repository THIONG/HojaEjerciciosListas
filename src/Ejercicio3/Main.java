package Ejercicio3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List <Persona> tresPersonas = new ArrayList <Persona>();
        Scanner sc = new Scanner(System.in);
        String nif, nombre, apellidos;
        Persona persona;
        for (int i = 0; i < 3; i++) {
            System.out.println("Introduzca el NIF de la persona " + (i+1) + ": ");
            nif = sc.nextLine();
            System.out.println("Introduzca el nombre de una persona: " + (i+1) + ": ");
            nombre = sc.nextLine();
            System.out.println("Introduzca el apellido de una persona: " + (i+1) + ": ");
            apellidos = sc.nextLine();
            tresPersonas.add(new Persona(nif, nombre, apellidos));
        }

        Iterator it = tresPersonas.iterator();
        while(it.hasNext()){
            persona = (Persona) it.next();
            System.out.println(persona.toString());
        }

        System.out.println("Introduzca el NIF de la persona a buscar: ");
        nif = sc.nextLine();
        it = tresPersonas.iterator();
        while (it.hasNext()) {
            persona = (Persona) it.next();
            if(persona.getNif().equalsIgnoreCase(nif)){
                System.out.println(persona.toString());
            }
        }
    }
}
