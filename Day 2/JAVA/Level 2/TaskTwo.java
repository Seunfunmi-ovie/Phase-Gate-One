import java.util.Scanner;
public class TaskTwo{

    public static void main(String [] args){
    Scanner input = new Scanner(System.in);
   
        System.out.print("Enter first number: "); 
       
             int number = input.nextInt();
             if(number < 0){
             System.out.print("Negative");
             }else{
             System.out.print("Positive");
             }
             
             
             }


}
