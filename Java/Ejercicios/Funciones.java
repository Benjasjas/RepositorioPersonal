package Ejercicios;
import java.io.Console;

public class Funciones {
    /*Escriba una función que, dados dos números enteros recibidos como parámetros, devuelva el
    promedio entre ellos. */

    static float promedio(int num1, int num2){
        float resultado = (num1 + num2)*0.1f/2;
        return resultado;
    }
    
    public static void main(String[] args) {
        Console console = System.console();

        int num1 = Integer.parseInt(console.readLine("Ingrese valor 1: "));
        int num2 = Integer.parseInt(console.readLine("Ingrese valor 2: ")); 

        System.out.println("Su promedio es: " + promedio(num1, num2));
    }
}
