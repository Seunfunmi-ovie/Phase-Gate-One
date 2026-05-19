const prompt = require("prompt-sync")();
const number = Number(prompt("Enter Number: "));
if(number > 0){
console.log("Positive");
}else{
console.log("Negative");
}
