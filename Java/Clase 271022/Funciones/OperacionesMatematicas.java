package Funciones;

import java.io.Console;

public class OperacionesMatematicas {
    static int Suma(int num1, int num2){
        int resultado = num1 + num2;
        return resultado;
    }

    static int Resta(int num1, int num2){
        int resultado = num1 - num2;
        return resultado;
    }

    static int Multiplicacion(int num1, int num2){
        int resultado = num1 * num2;
        return resultado;
    }

    static float Division(int num1, int num2){
        if (num2 == 0) {
            return -1;
        } else {
            float resultado = num1*1.0f / num2;
            return resultado;
        }
    }

    public static void main(String[] args) {
        Console console = System.console(); //Declaramos la consola para luego pedir datos al usuario

        int opcion = 0; // Declaramos la variable opcion

        while (opcion != 5) { // Sigue funcionando hasta que el usuario igrese la opcion 5 por consola
            System.out.println(":::::::::::::::::::::::::::::"); 
            System.out.println("::::MENU::::"); 
            System.out.println("Ingrese 1 si desea sumar"); 
            System.out.println("Ingrese 2 si desea restar");
            System.out.println("Ingrese 3 si desea multiplicar"); 
            System.out.println("Ingrese 4 si desea dividir");
            System.out.println("Ingrese 5 para finalizar");
            System.out.println(":::::::::::::::::::::::::::::"); 

            /*Pedimos al usuario que ingrese una opcion para realizar una operacion (definidas en el menu)*/
            opcion = Integer.parseInt(console.readLine("Ingrese opcion: ")); 
            /* si la opcion ingresada no corresponde a ninguno de los siguientes valores, nos devolvera un error y 
            nos pedira ingresar nuevamente una opcion. */
            if (opcion!=1 && opcion!=2 && opcion!=3 && opcion!=4 && opcion !=5) {
                System.out.println("Esa no es una operación válida, intente nuevamente.");
            }
            else{
                if(opcion == 5){
                    System.out.println("Finalizado"); 
                    break;
                }
                int num1 = Integer.parseInt(console.readLine("Ingrese valor 1: "));
                int num2 = Integer.parseInt(console.readLine("Ingrese valor 2: "));     

                if(opcion == 1){
                    System.out.println("La suma de sus dos digitos es: " + Suma(num1, num2));
                }
                else if(opcion == 2){
                    System.out.println("La resta de sus dos digitos es: " + Resta(num1, num2));
                }     
                else if(opcion == 3){
                    System.out.println("La multiplicacion de sus dos digitos es: " + Multiplicacion(num1, num2));
                }  
                else {
                    while(num2 == 0){
                        System.out.println("Error, ingrese otro numero diferente de 0");
                        num2 = Integer.parseInt(console.readLine("Ingrese valor 2: ")); 
                    }
                    System.out.println("La division de sus dos digitos es: " + Division(num1, num2));
                }
            }
        }
    }
}