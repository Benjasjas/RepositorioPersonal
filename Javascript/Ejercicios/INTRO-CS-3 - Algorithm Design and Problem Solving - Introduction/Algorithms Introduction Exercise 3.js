function numeroMenor(listaNumeros) {
    var menor = listaNumeros[0];
    for (let i = 0; i < listaNumeros.length; i++) {
        if (listaNumeros[i] < menor) {
            menor = listaNumeros[i];
        }
    }
    return menor;
}
var numeros = [6, 3, 9, 23, 71, 5, 1, 8, 5, 2, 85, 2, 90];
var menor1 = numeroMenor(numeros);

numeros.splice(numeros.indexOf(menor1), 1);

var menor2 = numeroMenor(numeros);

console.log(menor1, menor2);