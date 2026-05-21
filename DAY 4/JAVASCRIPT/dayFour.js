    public class DayFour{

    public static void main(String[] args){
    int [] numbers = {8,6,12,4,-2}
    
    
    
    
    }
    
    public static int getNumber(int [] numbers){
    int secondLargest = [1];
    int largest = [0];
    for(int count = 0; count < numbers.length; count++){
    if(numbers[count] < secondLargest){
    secondLargest = largest;
    largest = numbers[count];
    
    }
    else{
    (number[count] < secondLargest && numbers[count] != largest);
            numbers[count] = secondLargest;
  
    }
    
    }
    return secondLargest;
    
    }
    }
