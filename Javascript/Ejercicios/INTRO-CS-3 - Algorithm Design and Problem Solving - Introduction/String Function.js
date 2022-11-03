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