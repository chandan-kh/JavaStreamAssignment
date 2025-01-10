import java.util.Arrays;
import java.util.List;

public class c1 {
    public static void main(String[] args) {
       
        calculateAverage(Arrays.asList(10, 20, 30, 40, 50));
        
    
        calculateAverage(Arrays.asList(-5, -10, -15, -20, -25));
        
       
        calculateAverage(Arrays.asList(-10, 20, -30, 40, -50));
        
        
        calculateAverage(Arrays.asList());
    }

    private static void calculateAverage(List<Integer> numbers) {
        double average = numbers.stream()
                                .mapToInt(Integer::intValue) 
                                .average()                 
                                .orElse(0.0);              
        
        System.out.println("List: " + numbers);
        System.out.println("Average: " + average);
        System.out.println("------------");
    }
}
