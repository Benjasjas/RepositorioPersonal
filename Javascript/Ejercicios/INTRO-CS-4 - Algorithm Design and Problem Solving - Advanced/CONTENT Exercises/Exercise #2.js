/*
Write a program to sort a list of numbers in descending order (from highest to lowest).
*/

/* 
- La funcion "numeroMayor" revisa todos los numeros de la matriz "listaNumeros" y devuelve el nro mayor
- La funcion "ordenarLista" toma como parametro una matriz de numeros, y mientras la matriz de numeros tenga elementos dentro de ella
la funcion va a tomar el numero mayor de la matriz, lo va agregar a la matriz "listaOrdenada" y lo va a eliminar de la matriz
"listaNumeros", este proceso ser realizara hasta que se quede sin elementos. Una vez se quede sin elementos, retorna la matriz 
"listaOrdenada"
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

function ordenarLista(listaNumeros) {
    var listaOrdenada = [];

    while (listaNumeros.length > 0) {
        let mayor = numeroMayor(listaNumeros);
        listaOrdenada.push(mayor);
        listaNumeros.splice(listaNumeros.indexOf(mayor), 1);
    }

    return listaOrdenada;
}

var listaNumeros = [6, 3, 9, 23, 71, 5, 1, 8, 5, 2, 85, 2, 90];

console.log(ordenarLista(listaNumeros));