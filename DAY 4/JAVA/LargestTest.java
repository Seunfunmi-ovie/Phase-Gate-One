import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class LargestTest{

@Test

public void testThatFunctionTestForSmallestNumberInAnArray(){
        
        int [] numbers = {0,9,10,3,8,4,7,12};
        int expected = 0;
        int actual = Largest.getSmallest(numbers);
        
        assertEquals(expected,actual);
        }
        
        
     @Test   
        
 public void testThatFUnctionTestForLargestNumberInAnArray(){
 
 int [] numbers = {0,9,10,3,8,4,7,12};
        int expected = 12;
        int actual = Largest.getLargest(numbers);
        
        assertEquals(expected,actual);
        }
        
        @Test   
        
 public void testThatFUnctionGetSortedNumberInTheArray(){
 
 int [] numbers = {1,9,10,3,8,4,7,12};
        int []expected = {1, 3, 4, 7, 8, 9, 10, 12};
        int[] actual = Largest.getSorted(numbers);
        
        assertArrayEquals(expected,actual);
        }
        
 }       

    
