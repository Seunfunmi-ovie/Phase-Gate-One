import java.util.Scanner;
public class TaskThree{

    public static void main(String [] args){
    Scanner input = new Scanner(System.in);
   
        System.out.print("Enter first number: "); 
       
             int score = input.nextInt();
             if(score >= 50){
             System.out.print("pass");
             }else{
             System.out.print("fail");
             }
             
             
             }


}
