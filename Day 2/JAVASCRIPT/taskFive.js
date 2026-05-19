const prompt = require("prompt-sync")();
const celsius = Number(prompt("Enter number: "));
const fahrenheit = (celsius * 1.8) + 32;
console.log("Fahrenheit: " + fahrenheit);
