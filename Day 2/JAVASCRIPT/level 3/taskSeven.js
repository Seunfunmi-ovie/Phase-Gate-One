const prompt = require("prompt-sync")();
const number = prompt("Enter number ");
for(let count = 0; count < number; count++){
let sum += number;
}
console.log("Sum" + sum);
