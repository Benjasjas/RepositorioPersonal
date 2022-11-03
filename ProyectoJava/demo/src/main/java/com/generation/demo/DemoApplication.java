package com.generation.demo;

import java.io.Console;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.generation.demo.models.Botella;
import com.generation.demo.models.Perro;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		Console console = System.console();

		/*Necesitamos preguntarle al usuario cuántos objetos quiere crear, en este caso, cuántas
		botellas quiere crear.*/
		
		/*Vamos hacer un bucle que nos va a indicar la cantidad de objetos que quiere crear, y los datos
		 * a pedir (marca, el material, el contenido de la botella, etc)*/
		/*Los objetos que se creen, deben guardarse en un Arraylist y mostrarlo en pantalla */

		Integer contador = Integer.parseInt(console.readLine("ingrese cuantas botellas quiere crear: ")); // este es nuestro contador de cuantas botellas quiere crear el usuario
		// ArrayList <Botella> jabaBotellas = new ArrayList<>(); //este es nuestro arraylist donde se guardaran las "botellas" creadas por el usuario
		Map <String, Botella> jabaBotellas = new HashMap<>();
		
		//ahora haremos el bucle While, hasta que el contador sea 0
		for(int i = 1; i <= contador; i++){
			Botella botella = new Botella(); //esta botella vacia, recibira los atributos que tiene el objeto "botella"

			System.out.println("Ingrese los atributos de la botella " + i); //nos dice el nro de botella que está creando
			//aqui pedimos al usuario ingresar todos los atributos de nuestro "objeto" botella
			botella.setLiquido(console.readLine("ingrese el contenido de la botella: ")); // ingrese el liquido
			botella.setMarca(console.readLine("ingrese la marca de la botella: ")); // ingrese la marca
			botella.setMl(Integer.parseInt(console.readLine("ingrese el volumen de la botella: "))); // ingrese el volumen
			botella.setMaterial(console.readLine("ingrese el material de la botella: "));	// ingrese el material

			jabaBotellas.put("Botella " + i, botella);
			System.out.println("------------------------------------------------------------------------------------");

			
		}
		System.out.println(jabaBotellas);



		// Perro perroDefault = new Perro();//estoy creando un perro con el contructor por defecto
		// Perro perroCompleto = new Perro("Max", "rulos", "Salchicha", true);
		// Perro perroQuiltro = new Perro("Pelusa", "Liso");


		// Botella botellaDefault = new Botella();
		// Botella cocacola = new Botella("grande", "coca zero", "Coca-Cola Company");
		// Botella pepsi = new Botella("pequeña", "porotos", "ccu");

		// System.out.println("-------------------------------------------------------------");
		// System.out.println("botella default " + botellaDefault.toString());
		// System.out.println("botella coca-cola " + cocacola.toString());
		// System.out.println("botella pepsi " + pepsi.toString());
		// System.out.println("-------------------------------------------------------------");

		// perroDefault.setNombre("copi-copi");
		// perroDefault.setPelaje("pelo duro");
		// perroDefault.setRaza("gucci");
		// perroDefault.setVacunado(true);


		// System.out.println("-------------------------------------------------------------");
		// System.out.println("botella default " + botellaDefault.toString());
		// botellaDefault.setTamanio("mediano");
		// botellaDefault.setLiquido("piricola");
		// botellaDefault.setMarca("tio marcelo dinasty");
		// System.out.println("botella default despues del set " + botellaDefault.toString());
		// System.out.println("-------------------------------------------------------------");

		// perroQuiltro.setVacunado(true);

		// String nombrePerro = perroDefault.getNombre();
		// String nombrePerro2 = perroCompleto.getNombre();

		// String marcaBotella = botellaDefault.getMarca();
		// String marcaBotella2 = pepsi.getMarca();
		// String marcaBotella3 = cocacola.getMarca();


		// System.out.println("-------------------------------------------------------------");
		// System.out.println("marca botella 1 " + marcaBotella);
		// System.out.println("marca botella 2 " + marcaBotella2);
		// System.out.println("marca botella 3 " + marcaBotella3);
		// System.out.println("-------------------------------------------------------------");

		// System.out.println(nombrePerro);
		// System.out.println(nombrePerro2);
		// System.out.println(perroQuiltro.toString());
		// perroQuiltro.setVacunado(false);

		/* perroDefault.ladrar();
		perroCompleto.caminar(); */

		/* System.out.println(perroQuiltro.truco("hacete el muerto"));
		System.out.println(perroCompleto.adopcion());
		System.out.println(perroQuiltro.adopcion()); */
		
	}

}
