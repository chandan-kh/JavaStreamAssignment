import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class c3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 2, 1, 5, 6, 4, 7, 8, 9);
        int k = 4; 

        Integer kthLargest = numbers.stream()
                                    .sorted((a, b) -> b - a) // Sort in descending order
                                    .distinct()              // Remove duplicates
                                    .skip(k - 1)             // Skip the first (k-1) elements
                                    .findFirst()             // Get the next element
                                    .orElse(null);           // Handle empty case

        if (kthLargest != null) {
            System.out.println("The " + k + "rd largest number is: " + kthLargest);
        } else {
            System.out.println("The list doesn't have " + k + " distinct elements.");
        }
    }
}
