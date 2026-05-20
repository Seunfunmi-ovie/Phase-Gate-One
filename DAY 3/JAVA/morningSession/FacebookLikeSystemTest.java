import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class  FacebookLikeSystem{




            @Test

        public class testThatFunctionReturnsNoLikesIfNoOneLikes{

        String [] names = [0];
        String [] expected = "No one likes this";
        String [] actual = FacebookLikeSystem.getLikes(names);
        
        
      assertEquals(expected, actual);   

} 

    @Test

        public class testThatFunctionReturnsLikesIfNameAppears{

        String [] names ={"Peter"};
        String [] expected = "Peter likes this";
        String [] actual = FacebookLikeSystem.getLikes(names);
        
        
      assertEquals(expected, actual);   

    
    }
    
    }
    
    
