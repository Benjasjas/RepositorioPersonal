import java.io.Console;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CalculadoraPeso {
    public static void main(String[] args) {
        Console console = System.console();
        
        System.out.println("::::MENU::::"); 
        int repeticion = Integer.parseInt(console.readLine("Ingrese cuantas veces quiere repetir: ")); // esta linea pide la cantidad de repeticiones

        System.out.println("Ingrese 1 si desea convertir el peso en Marte"); 
        System.out.println("Ingrese 2 si desea convertir el peso en Luna\n");

        Map<String, ArrayList> pesosMapa = new HashMap<>();
        
        ArrayList<Map> pesosMarte = new ArrayList<>();
        ArrayList<Map> pesosLuna = new ArrayList<>();

        
        while(repeticion!= 0){ // mientras repeticion sea diferente de 0, hacer lo siguiente:
            
            int opcion = Integer.parseInt(console.readLine("Ingrese opcion: ")); //esta linea define mi variable "opcion" como un valor entero
            Float pesoPlaneta = 0.0f;
            Map<String, Float> guardaVar = new HashMap<>();

            if (opcion == 1){ // si el valor de "opcion" es igual a 1, entonces realizara la formula del calculo del peso de Marte
                float peso = Float.parseFloat(console.readLine("Ingrese el peso a convertir: "));
                pesoPlaneta = Math.round(((peso/9.81)*3.711)*100.0)/100.0f;
                System.out.println("El peso en Marte sería de: "+ pesoPlaneta);

                guardaVar.put("Tierra", peso);
                guardaVar.put("Marte", pesoPlaneta);
                pesosMarte.add(guardaVar);

            } else if (opcion == 2){//si el valor de "opcion" es igual a 2, entonces realizara la formula del calculo del peso de la Luna
                float peso = Float.parseFloat(console.readLine("Ingrese el peso a convertir: "));
                pesoPlaneta = Math.round(((peso/9.81)*1.622)*100.0)/100.0f;
                System.out.println("El peso en la Luna sería de: "+ pesoPlaneta);

                guardaVar.put("Tierra", peso);
                guardaVar.put("Luna", pesoPlaneta);
                pesosLuna.add(guardaVar);
                
            } else {// si no es ninguno de los dos valores, la consola devolvera "error"

                System.out.println("Error");
            }
            repeticion--;// esta linea le resta -1 a mi variable "repeticion" cuando termina el If
            System.out.println("***********************************");
        }
        pesosMapa.put("Luna", pesosLuna);
        pesosMapa.put("Marte", pesosMarte);
        System.out.println(pesosMapa);
    }
}
