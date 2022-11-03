/**
 * Exercise #2
 * Create a function that takes in one number
 * and checks if it is divisible by 4 or divisible by 9.
 * Print out to the console true if a number
 * if divisible by 4 or 9, and false if a
 * number is not divisible by either number.
 */

function divisible(x) {
    if (x % 4 == 0 || x % 9 == 0) {
        console.log(true);
    } else {
        console.log(false);
    }
}
divisible(7);