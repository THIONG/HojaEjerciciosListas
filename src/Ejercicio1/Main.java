package Ejercicio1;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int cont = 0;
        String cogerPalabras;
        ArrayList frases = new ArrayList();
        frases.add("Hello,");
        frases.add("how");
        frases.add("are");
        frases.add("you?");

        Iterator it = frases.iterator();
        while (it.hasNext()){
            cogerPalabras = (String) it.next();
            cont++;
            System.out.println("Posicion " + cont + " del Array: " + cogerPalabras);
        }
    }
}
