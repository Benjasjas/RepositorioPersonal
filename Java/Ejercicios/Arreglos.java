package Ejercicios;
import java.util.ArrayList;
import java.util.Arrays;

public class Arreglos {
    /*Escriba un programa que permita imprimir en pantalla cada uno de los elementos del siguiente
    arreglo: [0, 28, 30, 10, 4]. */
    public static void main(String[] args) {
        ArrayList <Integer> arreglo = new ArrayList <Integer>(Arrays.asList(0, 28, 30, 10, 4));
        for (int i : arreglo) {
            System.out.println(i);
        }
    }
}
