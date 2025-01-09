import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GreaterThanK {
    public static void main(String[] args){

        List<Integer> lis = Arrays.asList(1,2,3,4,5,6,7,8,9);
        int k = 5;
        Collectors Collection;
        List<Integer> res = lis.stream()
                .filter(x -> x > k)
                .collect(Collectors.toList());

        System.out.println(res);

    }
}
