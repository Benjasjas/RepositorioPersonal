// Se desea tener una función verificadora encargada de revisar si dentro de el arreglo de valores de los productos a comprar no
// existan valores negativos ingresados por error, en caso de no existir debe retornar un mensaje de éxito, en caso contrario
// debe retornar un mensaje de error junto con el número negativo y el índice en el que se encontraba.

function verificadora(listaNumeros) {
    let flag = false;
    for (let i = 0; i < listaNumeros.length; i++) {
        if (listaNumeros[i] < 0) {
            console.log(
                "Existen numeros negativos en la posicion",
                listaNumeros.indexOf(listaNumeros[i]),
                listaNumeros[i]
            );
            flag = true;
        }
    }
    if (!flag) {
        console.log("No existen numeros negativos");
    }
}

var numeros = [1, 4, 6, 1, 4, 5, 68, 67, 89, 43, 24, 1];
verificadora(numeros);