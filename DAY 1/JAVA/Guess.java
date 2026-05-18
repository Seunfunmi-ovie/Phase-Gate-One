
import java.util.Scanner;
import java.util.Random;
public class Guess{
public static void main(String [] args){

        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int guess = random.nextInt(100) +1;    
        int numberofAttempt = 0;
       System.out.println("Enter a Number: ");
       int number = input.nextInt();
   
        for(int count = 0; count <= 5; count++){
     
    System.out.print("Enter Number between 1 and 100: ");
        int userinput = input.nextInt();
      if(userinput <= -1){
      System.out.println("Do not count");
      }  
      else if(userinput > number){
      System.out.println("Answer is Higher");
      } 
      else if(userinput < number){
      System.out.println("Answer is lower");
      }
      else if(userinput == number){
        
         System.out.println("Stop");
        break;
      } 
      if(guess == 1){
      System.out.println("Legendary");
      }
      else if(guess == 2){
      System.out.println("Excellent");
      
      }
      else if(guess == 3 && guess == 4){
      System.out.println("Good");
      }
      else if(guess == 5){
      System.out.println("Close");
        }
        else{
        System.out.println("Better luck");
}
}

}

}
