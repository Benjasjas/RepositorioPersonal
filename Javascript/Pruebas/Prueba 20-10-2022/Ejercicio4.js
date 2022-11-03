// Dado el siguiente arreglo [200,5500,900,7000,500,300] con los valores de cada
// producto
// Crea una función que retorne el valor del producto más costoso.
// Crea una función que retorne el valor del producto menos costoso.

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

// function funcionMezclada(listaNumeros) {
//     var menor = listaNumeros[0];
//     var mayor = listaNumeros[0];
//     for (let i = 0; i < listaNumeros.length; i++) {
//         if (listaNumeros[i] < menor) {
//             menor = listaNumeros[i];
//         }
//         if (listaNumeros[i] > mayor) {
//             mayor = listaNumeros[i];
//         }
//     }
//     return [mayor, menor];
// }

// console.log("El producto menos costoso es de ", funcionMezclada(productos));