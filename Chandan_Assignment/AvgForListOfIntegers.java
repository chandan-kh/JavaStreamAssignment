import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AvgForListOfIntegers {
    public static void main(String[] args){

        List<Integer> lis = Arrays.asList(1,4,5,6,3,4,57,89);
        System.out.println(lis.stream().mapToInt(Integer::intValue).average().getAsDouble());

    }
}
