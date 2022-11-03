// Desafio 2
// Cree un proyecto nombre libre pista Vamos a encontrar el área y el perímetro de un círculo.
// Escriba una aplicación Java que solicite al usuario que ingrese el diámetro de un círculo y calcule el área y el perímetro del 
// círculo.
// Realice una operación de conversión ampliada (de entero a doble) al almacenar el resultado de las operaciones.
// Imprime los resultados de las dos operaciones en la consola.
import java.io.Console;

public class PerimetroAreaCirculo {
    public static void main(String [] args) {
        Console console = System.console();
        
        //Diametro
        String diametro = console.readLine("inserte diametro: ");
        Double radio = Double.parseDouble(diametro)/2; 

        //perimetro
        Double perimetro = 2 * Math.PI * radio;
        //area
        Double area = Math.PI * Math.pow(radio, 2);

        System.out.println("el perimetro del circulo es: "+perimetro);
        System.out.println("el area del circulo es: "+area);
    }
}
