//Hacer un detector de numeros primos con Break hasta el número 23
function esPrimo(x) {
    if (x <= 1) {
        return false;
    } else {
        for (var i = 2; i <= x - 1; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}
// console.log(esPrimo(50));

for (var i = 1; i <= 23; i++) {
    if (esPrimo(i)) {
        console.log(i + ", Es primo");
    } else {
        console.log(i + ", No es primo");
    }
}
var cont = 1;
while (cont <= 23) {
    if (esPrimo(cont)) {
        console.log(cont + ", Es primo");
    } else {
        console.log(cont + ", No es primo");
    }
    cont++;
}