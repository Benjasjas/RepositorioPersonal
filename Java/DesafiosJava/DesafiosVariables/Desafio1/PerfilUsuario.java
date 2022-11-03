// Desafio 1:
// Cree una clase titulada "Perfil de usuario"
// crear funcion main
// Escriba el código para que la aplicación almacene el nombre, la edad, el género, la preferencia laboral, la nacionalidad y el tipo 
// de sangre de los usuarios.

// Piense en los nombres de variables que desea asignar a las propiedades anteriores y las convenciones de nombres de variables que 
// se deben seguir.
// Utilice la edad para calcular el año en que nació un usuario.
// Imprima los valores en la consola de un usuario.
import java.io.Console;

public class PerfilUsuario {
    public static void main (String [] args){
        Console console = System.console();

        //nombre
        String nombre = console.readLine("inserte su nombre: ");
        System.out.println("su nombre es: "+nombre);

        //edad
        String edad = console.readLine("inserte su edad: ");
        int edadInt = Integer.parseInt(edad); 
        int anioActual = 2022;
        int anioNacimiento = anioActual - edadInt;

        System.out.println("su edad es: "+edadInt);
        System.out.println("su año de nacimiento es: "+anioNacimiento);
    
        //genero
        String genero = console.readLine("inserte su genero: ");
        System.out.println("su genero es: "+genero.charAt(0));

        //preferencia laboral
        String preferenciaLaboral = console.readLine("inserte su preferencia laboral: ");
        System.out.println("su preferencia laboral es: "+preferenciaLaboral);

        //nacionalidad
        String nacionalidad = console.readLine("inserte su nacionalidad: ");
        System.out.println("su nacionalidad es: "+nacionalidad);

        //tipo de sangre
        String tipoDeSangre = console.readLine("inserte su tipo de sangre: ");
        System.out.println("su tipo de sangre es: "+tipoDeSangre);
    }
}
