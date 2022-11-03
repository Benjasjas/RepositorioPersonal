package Ejercicios.ArreglosMatrices;

import java.util.ArrayList;
import java.util.Arrays;

/*Escriba una función tal que, dados dos arreglos de números enteros ya ordenados de menor a mayor, genere
un nuevo arreglo correspondiente a la lista ordenada de la mezcla de ambos. Por ejemplo, si se reciben los
arreglos [1, 3, 6, 9, 17] y [2, 4, 10, 17], entonces la función debe devolver [1, 2, 3, 4, 6, 9, 10, 17, 17]. */

public class OrdenaMatrizMenorAMayor {
    public static void main(String[] args) {

        ArrayList <Integer> arreglo1 = new ArrayList <Integer>(Arrays.asList(1, 3, 6, 9, 17));
        ArrayList <Integer> arreglo2 = new ArrayList <Integer>(Arrays.asList(2, 4, 10, 17));
        ArrayList <Integer> arreglo3 = new ArrayList <Integer>();

        while(arreglo1.size() > 0 || arreglo2.size() > 0){
            if (arreglo1.size() > 0 && arreglo2.size() > 0 ) {
                if (arreglo1.get(0) < arreglo2.get(0)){
                    int menor = arreglo1.get(0);
                    arreglo3.add(menor);
                    arreglo1.remove(0);
                }
                else{
                    int menor = arreglo2.get(0);
                    arreglo3.add(menor);
                    arreglo2.remove(0);
                }
            }
            else if (arreglo1.size() > 0){
                int menor = arreglo1.get(0);
                arreglo3.add(menor);
                arreglo1.remove(0);
            }
            else {
                int menor = arreglo2.get(0);
                arreglo3.add(menor);
                arreglo2.remove(0);
            }
        }
        System.out.println(arreglo3);
    }
}