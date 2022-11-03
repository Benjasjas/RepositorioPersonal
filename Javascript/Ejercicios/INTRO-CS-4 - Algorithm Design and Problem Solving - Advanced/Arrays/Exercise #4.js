// var student1Courses = ['Math', 'English', 'Programming'];
// var student2Courses = ['Geography', 'Spanish', 'Programming'];
// Create a program that loops over the 2 arrays; if there are any common courses print them out to the console.

var student1Courses = ["Math", "Programming", "English", "javascript", "html"];
var student2Courses = [
    "Geography",
    "Spanish",
    "Programming",
    "css",
    "javascript",
];

function printCommonCourses(array1, array2) {
    for (let i = 0; i < array1.length; i++) {
        for (let j = 0; j < array2.length; j++) {
            if (array1[i] === array2[j]) {
                console.log(array1[i]);
            }
        }
    }
}

printCommonCourses(student1Courses, student2Courses);