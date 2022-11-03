// Write a program to sort a list of names alphabetically.

function primerNombre(nombres) {
    var primero = nombres[0];
    for (let i = 1; i < nombres.length; i++) {
        if (nombres[i] < primero) {
            primero = nombres[i];
        }
    }
    return primero;
}

function ordenarNombres(nombres) {
    var listaOrdenada = [];

    while (nombres.length > 0) {
        let primero = primerNombre(nombres);
        listaOrdenada.push(primero);
        nombres.splice(nombres.indexOf(primero), 1);
    }

    return listaOrdenada;
}

var listaNombres = ["Maria", "Dani", "Luis", "Juan", "Camila"];
console.log(ordenarNombres(listaNombres));