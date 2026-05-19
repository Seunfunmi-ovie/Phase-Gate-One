import java.util.Scanner;
public class TaskFive{

    public static void main(String [] args){
    Scanner input = new Scanner(System.in);
   
        System.out.print("Enter first number: "); 
       
             double celsius = input.nextInt();
             
       double fahrenheit = (celsius * 1.8) + 32;
       
       System.out.print(" Fahrenheit is: " + fahrenheit);     
       
       
       }
       
       
       }
