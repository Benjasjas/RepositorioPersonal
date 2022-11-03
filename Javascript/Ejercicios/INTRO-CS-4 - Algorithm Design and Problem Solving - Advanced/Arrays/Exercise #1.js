/* 
Open up a blank repl.it set to Javascript. Copy the code below into your workspace:

var arr = ["This", "is", "a", "sentence."];
function printOutString() {
  // your code here
}

printOutString();
Complete the function to print out the string This is a sentence.
*/

var arr = ["This", "is", "a", "sentence."];

function printOutString(arr) {
    var oracion = "";
    for (let i = 0; i < arr.length; i++) {
        oracion = oracion + arr[i] + " ";
    }

    return oracion;
}

console.log(printOutString(arr));