import java.util.Scanner;
public class TaskSix{
public static void main(String[] args){

        Scanner input = new Scanner(System.in);
System.out.print("Enter number: ");
       int numbers = input.nextInt();
                int sum = 0;
        for(int count = 1; count <= numbers; count++){
        
            sum += count;
        }
        
        System.out.print("Sum: " + sum);
}

}
