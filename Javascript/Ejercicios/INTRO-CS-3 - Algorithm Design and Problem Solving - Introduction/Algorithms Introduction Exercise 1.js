function completeTasks(tasks) {
    if (tasks >= 0 && tasks <= 6) {
        return "Failed";
    } else if (tasks > 6 && tasks <= 9) {
        return "Insufficient";
    } else if (tasks > 9 && tasks <= 14) {
        return "Good";
    } else if (tasks == 15) {
        return "Excellent";
    } else {
        return "Error";
    }
}

console.log(completeTasks(20));