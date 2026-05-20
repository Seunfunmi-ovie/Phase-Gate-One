import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MiniParkingLotTest{


        @Test
        
        public void testThatFunctionTestForEmptyParkingLotToGiveSpace(){
        
        int[] numbers = {0,0,1,0,1,1,0,0,1,1,1,0,5,0};
        int expected = 1;
        int actual = MiniParkingLot.getSpace(numbers,input);
        
        
        assertEquals(expected,actual);
        



        }



}



