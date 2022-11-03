var numerosDelUsuario = [];
for (let i = 0; i < 5; i++) {
    numerosDelUsuario.push(parseInt(prompt("Ingrese un numero"))); // el prompt es como un input en python
}
console.log(numerosDelUsuario);

var mayor = 0;

for (let i = 0; i < 5; i++) {
    if (mayor < numerosDelUsuario[i]) {
        mayor = numerosDelUsuario[i];
    }
}
console.log(mayor);