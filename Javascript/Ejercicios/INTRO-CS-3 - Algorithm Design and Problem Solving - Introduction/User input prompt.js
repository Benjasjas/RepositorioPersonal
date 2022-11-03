/**
 * Create a fork of this exericise.
 * Read through the instructions and complete the exercise.
 */

/**
 *
 *  Create a function that takes in 2 inputs (using prompt)
 *  and goes through the 5 arithmetic operators (+, -, /, *,
 *  %). The expected output on the console is:
 * `The sum is x` -> x is the calculated sum
 * `The subtraction is y` -> y is the calculated difference
 * `The multiplication is z` -> z is the calculated multiplication
 * `The division is w` -> w is the calculated division
 * `The remainder is q` -> q is the calculated remainder
 */

function mathematicOperations(num1, num2) {
    console.log("The sum is", num1 + num2);
    console.log("The subtraction is", num1 - num2);
    console.log("The multiplication is", num1 * num2);
    console.log("The division is", num1 / num2);
    console.log("The remainder is", num1 % num2);
}

var input1 = prompt("Ingrese el primer numero");
var input2 = prompt("Ingrese el segundo numero");

mathematicOperations(parseInt(input1), parseInt(input2));