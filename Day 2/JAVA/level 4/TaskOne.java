public class TaskOne{
public static void main(String [] args){


System.out.print(addNumber(4,6));
int back = checkEven(number);
System.out.print("Even: " + back(8));
int square = squareNumber(number);
System.out.print("Square: " + square(4));
int temp = convertCelsius(celsius);
System.out.print("Temp:" + temp(4));
int prime = getPrime(number);
System.out.print("Prime:" + prime(5));
int large = getLargest(numbers,numbertwo,numberthree);
System.out.print("Largest Num: " + large(5,90,8));
int arr = simpleInterest(principal,rate,time);
System.out.print("SI: " + arr(5,90,8));
int rec = getArea(length, width);
System.out.print("AREA: " + rec(5,8));
int remain = getReverse(number);
System.out.print("Reverse: " + remain(568));

}




public static int addNumber(int a , int b){
        int num = a + b;
        return num;
}


public static boolean checkEven(number){
        
        if(number % 2 == 0){
        return true;
        
        return false;   
}
public static int squareNumber(int number){
return number * number;
}
public static int convertCelsius(int celsius){
int fahrenheit = (celsius * 1.8) + 32;

        return fahrenheit;

 
}public static boolean getPrime(int number){

        if(number < 2){
        return false;
        
   for(int count = 2; count < number; count++){
   if(number % count == 0){
   
        
   }
   return true;
   
   }   

}
public static int getLargest(int numbers, int numbertwo,int numberthree){
            int largest = 0;
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

public static int simpleInterest(int principal, int rate, int time){
    int interest = 0; 
    
    interest = (principal * rate * time/100);
    return interest;
}
        
        
        public static int getArea(int length, int width){
       
            int area = 0;
                    area = length * width;
                    return area;
}


        public static int getReverse(int number){
        int reverse = 0;
        while(number != 0){
        digit = number % 10;
        reverse = number * 10 + digit;
        number = number/10;
        }
        return reverse;
}

//public static int getOccurences("")
