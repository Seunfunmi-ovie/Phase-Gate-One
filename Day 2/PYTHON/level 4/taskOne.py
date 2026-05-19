function  addNumber( a , b){
        let num = a + b;
        return num;
}


function boolean checkEven(number){
        
        if(number % 2 == 0){
        return true;
        
        return false;   
}
function squareNumber(number){

return number * number;
}
function convertCelsius(int celsius){
int fahrenheit = (celsius * 1.8) + 32;

        return fahrenheit;

 
}
function boolean getPrime(number){

        if(number < 2){
        return false;
        
   for(let count = 2; count < number; count++){
   if(number % count == 0){
   
        
   }
   return true;
   
   }   

}
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

function simpleInterest( principal,rate,time){
    let interest = 0; 
    
    interest = (principal * rate * time/100);
    return interest;
}
        
        
        public static int getArea(length, width){
       
            int area = 0;
                    area = length * width;
                    return area;
}


        function getReverse(number){
        let reverse = 0;
        while(number != 0){
        digit = number % 10;
        reverse = number * 10 + digit;
        number = number/10;
        }
        return reverse;
}

