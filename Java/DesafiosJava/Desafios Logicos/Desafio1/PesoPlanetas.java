import java.io.Console;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class PesoPlanetas {
    public static void main(String[] args) {
        Console console = System.console();
        /*
        Cree una clase que se llame conversorPeso
        cree un menú en donde se le pida al usuario ingresar:
        1 si desea covertir el peso en marte    
        2 si desea convertir el peso en luna.
        Luego pida al usuario el peso que desea convertir.
        realice la busqueda de cuantos kilos en tierra son en marte y en la luna
        calcule cuanto sería el peso ingresado
        muestre en pantalla el siguente mensaje según la seleccion del usuario
        "El peso ingresado en la luna sería de: ...."
        "El peso ingresado en Marte sería de: ...."
        ejemplo:

        Bienvenido.
        Ingerse 1 si desea covertir el peso en marte.
        Ingrese 2 si desea convertir el peso en luna.
        2
        Ingrese el peso que desea convertir
        50
        El peso ingresado en la luna sería de: 8.27

        double roundOff = Math.round(random * 100.0) / 100.0;
		System.out.println(roundOff);
        (peso/9.81)*3.711)
        */

        
        System.out.println("::::MENU::::"); 
        int repeticion = Integer.parseInt(console.readLine("Ingrese cuantas veces quiere repetir: ")); // esta linea pide la cantidad de repeticiones

        System.out.println("Ingrese 1 si desea convertir el peso en Marte"); 
        System.out.println("Ingrese 2 si desea convertir el peso en Luna");
        //ArrayList<Float> pesosArray = new ArrayList<>();
        ArrayList<Float> pesosLuna = new ArrayList<>();
        ArrayList<Float> pesosMarte = new ArrayList<>();

        Map<String, ArrayList> pesosPlanetas = new HashMap<>();
        pesosPlanetas.put("Marte", pesosMarte);
        pesosPlanetas.put("Luna", pesosLuna);
        
        while(repeticion!= 0){ // mientras repeticion sea diferente de 0, hacer lo siguiente:

            int opcion = Integer.parseInt(console.readLine("Ingrese opcion: ")); //esta linea define mi variable "opcion" como un valor entero
            Float pesoPlaneta = 0.0f;
            if (opcion == 1){ // si el valor de "opcion" es igual a 1, entonces realizara la formula del calculo del peso de Marte
                float peso = Float.parseFloat(console.readLine("Ingrese el peso a convertir: "));
                pesoPlaneta = Math.round(((peso/9.81)*3.711)*100.0)/100.0f;
                pesosMarte.add(pesoPlaneta);
                System.out.println("El peso en Marte sería de: "+ pesoPlaneta);
            } else if (opcion == 2){//si el valor de "opcion" es igual a 2, entonces realizara la formula del calculo del peso de la Luna
                float peso = Float.parseFloat(console.readLine("Ingrese el peso a convertir: "));
                pesoPlaneta = Math.round(((peso/9.81)*1.622)*100.0)/100.0f;
                pesosLuna.add(pesoPlaneta);
                System.out.println("El peso en la Luna sería de: "+ pesoPlaneta);
            } else {// si no es ninguno de los dos valores, la consola devolvera "error"

                System.out.println("Error");
            }
            //pesosArray.add(pesoPlaneta);
            repeticion--;// esta linea le resta -1 a mi variable "repeticion" cuando termina el If
            //System.out.println("quedan "+repeticion+" repeticiones"); // esta linea nos dice cuántas repeticiones nos quedan 
            System.out.println("***********************************");
        }
        //System.out.println(pesosArray);
        System.out.println(pesosPlanetas);
    }
}