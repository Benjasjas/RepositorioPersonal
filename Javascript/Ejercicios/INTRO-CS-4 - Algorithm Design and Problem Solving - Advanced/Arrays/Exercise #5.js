// For each of the exercises below, assume you are starting with the following people array.

var people = ["Maria", "Dani", "Luis", "Juan", "Camila"];

// Write a command that prints out all of the people in the list.
console.log(people);

// Write the command to remove "Dani" from the array.
people.splice(people.indexOf("Dani"), 1);
console.log(people);

// Write the command to remove "Juan" from the array.
people.splice(people.indexOf("Juan"), 1);
console.log(people);

// Write the command to add "Luis" to the front of the array.
people.unshift("Luis");
console.log(people);

// Write the command to add your name to the end of the array.
people.push("Benjamin");
console.log(people);

// Using a loop, iterate through this array and after console.log-ing "Maria", exit from the loop.
for (let i = 0; i < people.length; i++) {
    console.log(people[i]);
    if (people[i] === "Maria") {
        break;
    }
}

// Write the command that gives the indexOf where "Maria" is located.
people.indexOf("Maria");
console.log(people.indexOf("Maria"));

// At the end of the exercise, there should be 4 people in the array.
console.log(people);