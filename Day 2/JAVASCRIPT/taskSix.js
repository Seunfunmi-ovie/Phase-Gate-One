const prompt = require("prompt-sync")();
const numberOne = Number(prompt("Enter number: "));
const numberTwo = Number(prompt("Enter second number: "));
const Area = numberOne * numberTwo;
console.log("Area is " + Area);
