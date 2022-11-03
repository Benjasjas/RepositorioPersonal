// A movie cinema does price discounting depending on a customer's age.
// The app prompts a user to enter their age on the IntelliJ console after which it checks whether the user meets the discount 
// conditions.
// Age range	    Ticket Price
// Normal ticket	7 Euros
// Below 5      	60% Discount
// Over 60	        55% Discount
// Write the app so that the conditions above are met and the correct ticket price is returned.

import java.io.Console;
import java.util.ArrayList;

public class MovieDiscounts {
    public static void main(String[] args) {
        Console console = System.console();


    System.out.println("********************************");
    int entrada = Integer.parseInt(console.readLine("Ingrese la cantidad de entradas que quiere comprar: "));
    System.out.println(":::...MENU ENTRADAS...:::::");
    System.out.println("Entrada normal: 7 euros");
    System.out.println("Entrada menor de 5 años: 60% descuento");
    System.out.println("Entrada mayor de 60 años: 55% descuento");
    System.out.println("*********************************");

    float precioFinal = 0.0f;  // defino mi variable "precioFinal" como un valor float
    float precioNormal = 7.0f; // defino mi variable "precioNormal" como un valor float
    float sumaEntradas = 0.0f; // defino mi variable "sumaEntradas" como un valor float

    ArrayList<Float> precios = new ArrayList<>();
    
    for(int i = 1; i <= entrada; i++){ //declaro mi variable "i" empezando en 1, luego digo que itere hasta que "i" sea menor o igual que el cantidad de "entradas", y finalmente le digo a la funcion que itere en pasos de a 1

        int edad = Integer.parseInt(console.readLine("Ingrese su edad: "));
        if (edad < 5 && edad >= 0){ // si edad es mayor o igual a 0, y menor a 5. Calcula el precio con el 60% de descuento
            precioFinal = (float)(precioNormal*0.40);
            System.out.println("El precio de la entrada es: "+precioFinal+" euros");

        }else if(edad >60){// si edad es mayor a 60. Calcula el precio con el 55% de descuento
            precioFinal = (float)(precioNormal*0.45);
            System.out.println("El precio de la entrada es: "+precioFinal+" euros");

        }else{//si la edad está fuera de los rangos anteriores, no se aplica ningun descuento al precio final
            precioFinal = precioNormal;
            System.out.println("El precio de la entrada es: "+precioFinal+" euros");
        }

        sumaEntradas = sumaEntradas + precioFinal;// esta linea calcula el valor total de todas las entradas compradas
        precios.add(precioFinal);
    }

    System.out.println("Precio total: "+sumaEntradas+" Euros"); // se muestra en consola el valor total 
    System.out.println("Precios: " + precios);
    
    }
}