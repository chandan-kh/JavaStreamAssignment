import java.util.Arrays;
import java.util.List;

public class KthLargestNumber {
    public static void main(String[] args){

        List<Integer> numbers = Arrays.asList(3,4,5,6,7,8);
        int k =3;

        System.out.println(numbers.stream()
                .sorted((a,b) -> b-a)
                .skip(k-1)
                .findFirst()
                .get());

    }
}
