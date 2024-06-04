import java.util.Arrays;

public class ArrayClassWork2 {
    public static String ArrayClassWork(int[] expectingArray){
        int[] result = new int[expectingArray.length];
        for(int counter = 0; counter < expectingArray.length; counter++){
            result[counter] = expectingArray[0]*expectingArray[counter];
        }
        return Arrays.toString(result);
    }

}
