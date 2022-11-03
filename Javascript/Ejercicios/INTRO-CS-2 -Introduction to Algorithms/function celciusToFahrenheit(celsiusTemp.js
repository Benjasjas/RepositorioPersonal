/**
 * Funcion celciusToFahrenheit
 * recibe los siguientes parametros
 * @param {number} celsiusTemp
 * convierte los grados celcius a fahrenheit
 * guarda el resultado en una variable fahrenheit
 * y muestra por consola dicho valor
 */
function celciusToFahrenheit(celsiusTemp) {
    var fahrenheit = (celsiusTemp * 9) / 5 + 32;
    console.log("Celcius:", celsiusTemp);
    console.log("Fahrenheit:", fahrenheit);
}
celciusToFahrenheit(35);