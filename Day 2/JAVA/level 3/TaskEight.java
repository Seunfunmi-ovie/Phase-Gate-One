import java.util.Scanner;
public class TaskEight{
public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = input.nextInt();
                int sum = 0;
        for(int count = number; count <= 0; count--){
        System.out.print("Enter number: ");
        int numbers = input.nextInt();

        sum += number;
        }
        
        System.out.print("Sum: " + sum);
}

}
