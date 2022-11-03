/* 
Paso 1

Escriba un programa que tome dos listas y devuelva el mayor número de las dos listas. 
Sugerencia: llame a la función del ejercicio de clase n.° 1 
(el ejercicio n.° 1 debe devolver un solo número: el número más grande de la lista).

Paso 2

1.- Encuentra un compañero.
2.- Intercambia tu código.
3.- Lea el código de su socio y sugiera mejoras sobre cómo refactorizaría su código.
4.- Pruebe la corrección del código de su compañero (¿da el resultado correcto), 
    si no da el resultado correcto, trabajen juntos para arreglar el código.

*/

function numeroMayor(listaNumeros) {
    var mayor = listaNumeros[0];
    for (let i = 0; i < listaNumeros.length; i++) {
        if (listaNumeros[i] > mayor) {
            mayor = listaNumeros[i];
        }
    }
    return mayor;
}

function numeroMayorDeDosListas(lista1, lista2) {
    let mayor1 = numeroMayor(lista1);
    let mayor2 = numeroMayor(lista2);
    return [mayor1, mayor2];
}

var lista1 = [1, 2, 3, 4, 5];
var lista2 = [6, 7, 8, 9, 10];

console.log(numeroMayorDeDosListas(lista1, lista2));