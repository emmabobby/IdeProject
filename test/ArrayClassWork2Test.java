import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayClassWork2Test {
@Test
    public void testArrayClassWork2(){
    int[]input = new int[]{2,3,5,2,5,3};
    String result = ArrayClassWork2.ArrayClassWork(input);
    assertEquals("[4, 6, 10, 4, 10, 6]", result);
}

}