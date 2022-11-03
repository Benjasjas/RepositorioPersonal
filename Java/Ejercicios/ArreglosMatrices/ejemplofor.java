package Ejercicios.ArreglosMatrices;

import java.util.ArrayList;
import java.util.Arrays;

public class ejemplofor {
        public static void main(String[] args) {

            ArrayList <Integer> miArray = new ArrayList <Integer>(Arrays.asList(1, 2, 3, 4));
            for(int i: miArray){
                System.out.println(miArray.indexOf(i));
        }
    }
}
