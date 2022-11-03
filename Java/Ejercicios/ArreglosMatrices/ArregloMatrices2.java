package Ejercicios.ArreglosMatrices;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/*Escriba una función que reciba un arreglo de números enteros y un número N, e imprima en pantalla todos
los índices del arreglo donde aparece el valor N. Por ejemplo, si el arreglo es [1, 2, 3, 100, 23, 2, 2, 1] y da el
valor 2, entonces la función debe imprimir los números 1, 5 y 6 (pues esos son los índices donde aparece el
número 2). */

public class ArregloMatrices2 {
    static int indiceArray(ArrayList array, int N){
        int resultado;
        for(int i: array){
            if(N == array.indexOf(i)){
                resultado = array.indexOf(i);        
            }
        }
        return resultado;
    }

    public static void main(String[] args) {
        ArrayList <Integer> miArray = new ArrayList <Integer>(Arrays.asList(1, 2, 3, 100, 23, 2, 2, 1));
        System.out.println(indiceArray(miArray, 2));
    }
}