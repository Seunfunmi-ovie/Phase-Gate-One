const prompt = require("prompt-sync")();
const score = Number(prompt("Enter Number: "));
if(score >= 50){
console.log("Pass");
}else{
console.log("Fail");
}
