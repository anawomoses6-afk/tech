const prompt = require("prompt-sync")();
let number = Number(prompt("Enter a number: "));

function isPrimeNumber(number) {
    if (number <= 1) {
        return false;
    }
    for (let index = 2; index < number; index++) {
        if (number % index === 0) {
            return false;
        }
    }
    return true;
}

console.log(isPrimeNumber(number));


