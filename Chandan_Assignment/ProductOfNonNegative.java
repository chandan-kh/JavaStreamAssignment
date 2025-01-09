import java.util.Arrays;
import java.util.List;

public class ProductOfNonNegative {
    public static void main(String[] args){
        List<Integer> pt = Arrays.asList(2,-3,6,-1,8,4,-32,12);
        System.out.println(pt.stream().mapToInt(Integer::intValue).filter(x-> x>0).reduce(1,(a,b) -> a*b));
    }
}
