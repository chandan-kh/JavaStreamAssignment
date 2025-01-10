import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class c4 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 10, 7, 2, 15, 8, 5);
        int k = 7; 

        List<Integer> result = numbers.stream()
                                      .filter(num -> num > k) 
                                      .collect(Collectors.toList()); 

        System.out.println("Elements greater than " + k + ": " + result);
    }
}
