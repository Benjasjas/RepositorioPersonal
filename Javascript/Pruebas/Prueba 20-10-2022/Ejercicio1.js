// Don José todos los martes y jueves realiza un 20% de descuento en el total de las
// compras, crea una función la cual debe recibir un parámetro del día y el arreglo de
// valores de los productos a comprar, esta debe retornar el total final de la compra según
// corresponda o no descuento.

function descuento(dia, boleta) {
    let total = 0;
    boleta.forEach((element) => {
        total = total + element;
    });
    if (dia.toLowerCase() == "martes" || dia.toLowerCase() == "jueves") {
        total = total * 0.8;
        return total;
    } else {
        return total;
    }
}

var boleta = [200, 5500, 900, 7000, 500, 300];
console.log(descuento("Lunes", boleta));