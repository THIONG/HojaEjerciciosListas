package Ejercicio2;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList numeros = new ArrayList();
        int recogerNum = 0, suma = 0;
        numeros.add(10);
        numeros.add(20);
        numeros.add(20);
        numeros.add(40);

        Iterator it = numeros.iterator();
        while (it.hasNext()){
            recogerNum = (int) it.next();
            suma += recogerNum;
        }
        System.out.println("La suma de todos los numeros es: " + suma);
    }
}
