import java.util.Scanner;
public class TaskSeven{
public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        
                int sum = 0;
        for(int count = 1; count <= 5; count++){
        System.out.print("Enter number: ");
        int number = input.nextInt();

        sum += number;
        }
        
        System.out.print("Sum: " + sum);
}

}
