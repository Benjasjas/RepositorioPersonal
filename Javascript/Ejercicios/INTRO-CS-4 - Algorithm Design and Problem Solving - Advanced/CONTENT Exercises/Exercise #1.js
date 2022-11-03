/* 
Write a program that takes in an array of numbers and returns the largest number in the list. 
Example: The given array is [3, 5, 7, 1, 6] The largest number is 7. 
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
var numeros = [3, 5, 7, 1, 6];
var mayor = numeroMayor(numeros);

console.log(mayor);