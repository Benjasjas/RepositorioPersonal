puntoB = [2, 8];
puntoC = [8, 4];
while (puntoB[0] !== puntoC[0] || puntoB[1] !== puntoC[1]) {
    if (puntoB[0] > puntoC[0]) {
        puntoB[0] = puntoB[0] - 1;
        console.log("izq", puntoB);
    } else if (puntoB[0] < puntoC[0]) {
        puntoB[0] = puntoB[0] + 1;
        console.log("der", puntoB);
    } else {}
    if (puntoB[1] > puntoC[1]) {
        puntoB[1] = puntoB[1] - 1;
        console.log("abajo", puntoB);
    } else if (puntoB[1] < puntoC[1]) {
        puntoB[1] = puntoB[1] + 1;
        console.log("arriba", puntoB);
    } else {}
}