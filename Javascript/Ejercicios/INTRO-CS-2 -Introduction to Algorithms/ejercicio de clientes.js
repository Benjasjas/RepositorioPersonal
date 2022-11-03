cliente = 15;
marco = 0;
marie = 0;
tomas = 0;

while (cliente > 0) {
    marco = marco + 1;
    cliente = cliente - 1;

    marie = marie + 2;
    cliente = cliente - 2;

    if (tomas < 3) {
        tomas = tomas + 3;
        cliente = cliente - 3;
    }
}
console.log("Marco:", marco, "Marie:", marie, "Tomas:", tomas);