    public class DayFour{

   public static void main(String[] args){
    int [] numbers = {8,6,12,4,-2};
    
    int arr = smallNumber(numbers);
    System.out.print("Number: " + arr);
    
    
    }
   public static int  getNumber(int [] numbers){
   int secondLargest = numbers[1];
    int largest = numbers[0];
   for(int count = 0; count < length; count++){
              if(numbers[count] > secondLargest){
             secondLargest = largest;
            largest = numbers[count];
    }
    }
   
   
  else{
  (numbers[count] > secondLargest && numbers[count] != largest);
    secondLargest = numbers[count];
}
  
   
    return secondLargest;
    
     
    int small = numbers[0];
    for(int count = 0; count < numbers.length; count++){
    if(numbers[count] < smallest){
    smallest = numbers[count]; 
        }
  
  }
  return smallest;
  
  int num = secondLargest - smallest;
  
  return num;
  }
  
  }
  
  
  
