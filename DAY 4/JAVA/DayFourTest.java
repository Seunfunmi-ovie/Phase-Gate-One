import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DayFourTest{

        @Test
        
        public void testThatFunctionPicksNumberThatWhenAddedGivesANumber(){
        
        int [] numbers = {8,6,12,4,-2};
      //  assertTrue(DayFour.getNumber(numbers)); 
        int[]  expected = {8,-2};
        int []actual = DayFour.getNumbers(numbers);

        assertArrayEquals(expected, actual);
}



    //     @Test
        
     //   public void testThatFunctionCheckForNumbersThatArePrime(){
        
     //   int [] numbers = {1,2,5,7,6,8,9,12};
     //   int  expected = {5,7};
     //   int actual = DayFour.getNumber(numbers);
     //   
     //   assertArrayEqual(expected, actual);
//}


// @Test
        
   //    public void testThatFunctionTestForNegativeNumber(){
        
    //    int [] numbers = {1,2,-5,7,6,8,9,12};
     //   int  expected = {9,-5};
     //   int actual = DayFour.getNumber(numbers);
        
     //   assertArrayEqual(expected, actual);
//}
}

