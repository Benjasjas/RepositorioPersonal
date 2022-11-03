// Escriba un programa donde el usuario ingrese una calificación de un estudiante y el programa devuelva una nota basada en las 
// siguientes condiciones:
// Suspendió si obtuvo una nota igual o inferior a 3.  0 - 2
// Insuficiente si tuvo mayor a 3 pero menos que 5 (inclusive)  
// Bueno si obtuvo una nota mayor a 5 pero menor a 8 (inclusive) 5 - 7 
// Excelente si consiguió un 10 -
// Debe avisar si se ingresa un número fuera del rango (0 a 10)

import java.io.Console;

public class CalificacionEstudiantes {
    public static void main(String[] args) {
        Console console = System.console();

        int nota = Integer.parseInt(console.readLine("Ingrese su nota: "));

        if (nota == 10){ // 10
            System.out.println("Excelente, su nota es de: " + nota);
        }else if (nota > 5 && nota < 10){ // 9 - 6
            System.out.println("Bueno, su nota es de: " + nota);
        }else if (nota > 3 && nota <= 5){ // 5 - 4
            System.out.println("Insuficiente, su nota es de: " + nota);
        }else if (nota <= 3 && nota >= 0){ // 3 - 0
            System.out.println("Suspendio, su nota es de: " + nota);
        } else {
            System.out.println("El numero ingresado esta fuera del rango");
        }
    }
}