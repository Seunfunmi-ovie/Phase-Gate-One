function  addNumber( a , b){
        let num = a + b;
        return num
}
console.log(addNumber(4,6));

function boolean checkEven(number){
        
        if(number % 2 == 0){
        return true;
        
        return false;  
         
}
console.log (checkEven(4))
function squareNumber(number){

return number * number

}
console.log(squareNumber(4));
function convertCelsius( celsius){
const fahrenheit = (celsius * 1.8) + 32;

        return fahrenheit;

 
}
console.log(convertCelsius(4));
function boolean getPrime(number){

        if(number < 2){
        return false;
        
   for(let count = 2; count < number; count++){
   if(number % count == 0){
   
        
   }
   return true;
   
   }   

}
console.log(getPrime(5));
function getLargest(numbers,numbertwo,numberthree){
            let largest = 0;
            if(numbertwo > numberone && numbertwo > numberthree){
          return  numbertwo;
            }
            else if(numberthree > largest && numberthree > numbertwo){
            return numberthree;
            
            }
            else{
            return largest;
            }
}
console.log(getLargest(5));
function simpleInterest( principal,rate,time){
    let interest = 0; 
    
    interest = (principal * rate * time/100);
    return interest;
}
   console.log(simpleInterest(5,7,8));     
        
function getArea(length, width){
       
            let area = 0;
                    area = length * width;
                    return area;
}
console.log(getArea(5,9));

        function getReverse(number){
        let reverse = 0;
        while(number != 0){
        digit = number % 10;
        reverse = number * 10 + digit;
        number = number/10;
        }
        return reverse;
}
console.log(reverse(5908));
