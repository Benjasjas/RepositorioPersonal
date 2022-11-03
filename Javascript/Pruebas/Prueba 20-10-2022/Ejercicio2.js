// Don José hace un 5% de descuento a los clientes que compran más de 3 productos y al
// menos uno de ellos tiene un valor mayor a 10.000, realiza una función que calcule el
// total verificando si corresponde o no el descuento.

/* 
1.- verificar si tiene más de 3 elementos
2.- Si uno de esos elementos es mayor a 10.000
*/

function total(boleta) {
    let total = 0;
    let flag = false;
    boleta.forEach((element) => {
        total = total + element;
        if (element > 10000) {
            flag = true;
        }
    });
    if (boleta.length > 3 && flag) {
        total = total * 0.95;
    }
    return total;
}

var boleta = [200, 55000, 900, 7000, 500, 300];
console.log("Total compra", total(boleta));
console.log("Total sin descuento", 200 + 55000 + 900 + 7000 + 500 + 300);
console.log(
    "Descuento aplicado",
    (200 + 55000 + 900 + 7000 + 500 + 300) * 0.05
);