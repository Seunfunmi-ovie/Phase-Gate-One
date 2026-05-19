import java.util.Scanner;
public class TaskTen{
public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = input.nextInt();
         int sum = 0;      
        int reverse = 0;
        int digit = number % 10;
        reverse = reverse * 10 + digit;
        number = number/10;
  
       sum += number;
        
       System.out.print("Sum" + sum);
}

}
