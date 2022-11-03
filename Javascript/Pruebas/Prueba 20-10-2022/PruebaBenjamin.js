// Ejercicio 1
// Don José todos los martes y jueves realiza un 20% de descuento en el total de las
// compras, crea una función la cual debe recibir un parámetro del día y el arreglo de
// valores de los productos a comprar, esta debe retornar el total final de la compra según
// corresponda o no descuento.

/*
Si el día es martes o jueves, hacer un descuento del 20% en el total de su compra
 */

function descuento(dias, valores) {}

/*------------------------------------------------------------------------------------*/

//Ejercicio 2
// Don José hace un 5% de descuento a los clientes que compran más de 3 productos y al
// menos uno de ellos tiene un valor mayor a 10.000, realiza una función que calcule el
// total verificando si corresponde o no el descuento.

/* 
Si el array de compra tiene 3 elementos y también un de ellos tiene un valor mayor a 10.000
hacer un descuento del 5% al total de la suma de los elementos en el array
*/

/*------------------------------------------------------------------------------------*/

//Ejercicio 3
// Se desea tener una función verificadora encargada de revisar si dentro de el arreglo de
// valores de los productos a comprar no existan valores negativos ingresados por error,
// en caso de no existir debe retornar un mensaje de éxito, en caso contrario debe retornar
// un mensaje de error junto con el número negativo y el índice en el que se encontraba.

function verificadora(listaNumeros) {
    for (let i = 0; i < listaNumeros.length; i++) {
        if (listaNumeros[i] < 0) {
            console.log(
                "Existen numeros negativos en la posicion",
                listaNumeros.indexOf(listaNumeros[i])
            );
        }
    }
    console.log("No existen numeros negativos");
}

var numeros = [1, 4, 6, 1, 4, 5, 68, 67, 89, 43, 24, 1];

console.log(verificadora(numeros));

/*------------------------------------------------------------------------------------*/

//Ejercicio 4
// Dado el siguiente arreglo [200,5500,900,7000,500,300] con los valores de cada
// producto
// ○ Crea una función que retorne el valor del producto más costoso.
// ○ Crea una función que retorne el valor del producto menos costoso.

function numeroMayor(listaNumeros) {
    var mayor = listaNumeros[0];
    for (let i = 0; i < listaNumeros.length; i++) {
        if (listaNumeros[i] > mayor) {
            mayor = listaNumeros[i];
        }
    }
    return mayor;
}

function numeroMenor(listaNumeros) {
    var menor = listaNumeros[0];
    for (let i = 0; i < listaNumeros.length; i++) {
        if (listaNumeros[i] < menor) {
            menor = listaNumeros[i];
        }
    }
    return menor;
}

var productos = [200, 5500, 900, 7000, 500, 300];
console.log("El producto más costoso es de ", numeroMayor(productos));
console.log("El producto menos costoso es de ", numeroMenor(productos));