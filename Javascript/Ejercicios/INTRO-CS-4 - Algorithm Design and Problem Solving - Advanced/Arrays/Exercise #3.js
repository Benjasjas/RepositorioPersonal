/* 
Write a program to compute the sum and product (multiplication) of an array of numbers. Print out the sum and the product.

Example: Given an array [1, 2, 3, 4] The sum is 10. The product is 24.
*/

function sumaYMultiplicacion(array) {
    var suma = 0;
    var multiplication = 1;
    for (let i = 0; i < array.length; i++) {
        suma = array[i] + suma;
        multiplication = array[i] * multiplication;
    }

    console.log(suma, multiplication);
}
var array = [1, 2, 3, 4];
sumaYMultiplicacion(array);