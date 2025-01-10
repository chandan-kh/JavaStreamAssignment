import java.util.Arrays;
import java.util.List;

public class c5 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, -2, 4, 3, 5, -7);

        int product = numbers.stream()
                             .filter(num -> num >= 0) 
                             .reduce(1, (a, b) -> a * b); 

        System.out.println("Product of all non-negative numbers: " + product);
    }
}
