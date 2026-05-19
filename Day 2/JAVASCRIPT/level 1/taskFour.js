const prompt = require("prompt-sync")();
const numberOne = Number(prompt("Enter number: "));
const numberTwo = Number(prompt("Enter second number: "));
const Product = numberOne * numberTwo;
console.log("Product is " + Product);
