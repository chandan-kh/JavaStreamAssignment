import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class c2 {
    public static void main(String[] args) {
        String input = "swiss bank of lot of money";

        // Find all non-repeating characters
        String nonRepeatingChars = input.chars() // Stream of characters
            .mapToObj(c -> (char) c) // Convert int stream to Character stream
            .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting())) // Count occurrences
            .entrySet()
            .stream()
            .filter(entry -> entry.getValue() == 1) // Filter characters with count 1
            .map(Map.Entry::getKey) // Extract characters
            .map(String::valueOf) // Convert to String
            .collect(Collectors.joining()); // Join characters to a single string

        System.out.println("Non-repeating characters: " + nonRepeatingChars);
    }
}
