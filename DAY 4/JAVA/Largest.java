public class Largest{
public static void main(String [] args){
int[] numbers = {14,9,6,0,8,10};
int large = getLargest(numbers);
System.out.println("Largest: " + large);
int small = getSmallest(numbers);
System.out.println("Smallest: " + small);
int[] sort = getSorted(numbers);


for(int index = 0; index < sort.length; index++){
System.out.print(sort[index] + " ");
}

}


public static int getLargest(int [] numbers){
int largest = 0;
for(int count = 0; count <
 numbers.length; count++){
if(numbers[count] > largest){
largest = numbers[count];
}
}
return largest;
}


public static int getSmallest(int [] numbers){
int smallest = 0;
for(int count = 0; count < numbers.length; count++){
if(numbers[count] < smallest){
smallest = numbers[count];
}

}
return smallest;
}
public static int[] getSorted(int [] numbers){
int length = numbers.length;

for(int count = 0; count < length - 1; count ++){
     int smallest = count;
   for(int row = count +1; row < length; row++){
   if(numbers[row] < numbers[smallest]){
            smallest = row;
   }
   } 
   int temp = numbers[count];
   numbers[count] = numbers[smallest];
   numbers[smallest] = temp; 
}
return numbers;
}
}
