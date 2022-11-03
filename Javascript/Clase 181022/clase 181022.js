/**
 * 1. Create a fork of this repl.it.
 * 2. Write test cases to validate your code before you complete the exercise.
 * 3. Make sure to run your exercise and check
 * for correctness.
 */

/**
 * Exercise #1
 * Create a function that takes in one number
 * and checks if the number is greater than  10. Print out to the console true if it is greater and false otherwise.
 */

// function numero(x) {
//     if (x > 10) {
//         console.log("Verdadero");
//     } else {
//         console.log("Falso");
//     }
// }
// numero(8);

/**
 * Exercise #2
 * Create a function that takes in one number
 * and checks if it is divisible by 4 or divisible by 9.
 * Print out to the console true if a number
 * if divisible by 4 or 9, and false if a
 * number is not divisible by either number.
 */

// function divisible(x) {
//     if (x % 4 == 0 || x % 9 == 0) {
//         console.log("Verdadero");
//     } else {
//         console.log("Falso");
//     }
// }
// divisible(7);

/*---------------------------------------------------------------------------------------------------- */

// ( true && true )     -> verdadero
// ( false && true )    -> falso
// ( true && false )    -> falso
// ( false && false )   -> falso
// ( true || true)      -> verdadero
// ( true || false )    -> verdadero
// ( false || true)     -> verdadero
// ( false || false )   -> falso
// !( false || true )   -> falso
// !( false && true )   -> verdadero
// ( !false && true )   -> verdadero
// ( !true && true )    -> falso
// ( !false || false )  -> verdadero

/*------------------------------------------------------------------------------------------------------*/

/**
 * 1. Create a fork of this repl.it.
 * 2. Write test cases to validate your code before you complete the exercise.
 * 3. Make sure to run your exercise and check
 * for correctness.
 */

/**
 * Exercise 1:
 * We want to check if a string is empty.
 * If a string is not empty, we want to print
 * out the first character of that string.
 * If a string is empty, print out a text saying
 * "This string is empty"
 */

function checkEmptyString(str) {
    str = str.trim();
    if (str == "") {
        console.log("This string is empty");
    } else {
        console.log(str.charAt(0));
    }
}
checkEmptyString("Apple");

/**
 * Exercise 2:
 * We want to compare two strings and check if
 * they are the same - case insensitive.
 * Return a boolean - true if the two strings are
 * the same, and false if they are not
 */
function checkTwoStringsSame(str1, str2) {
    if (str1.toLowerCase() == str2.toLowerCase()) {
        console.log(true);
    } else {
        console.log(false);
    }
}
checkTwoStringsSame("HOLA", "hola");