const prompt = require("prompt-sync")();
const celsius = Number(prompt("Enter number"));
const fahrenheit = (celsius * (9/5)) + 32;
console.log("Fahrenheit" + fahrenheit);
