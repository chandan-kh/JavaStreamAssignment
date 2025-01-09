import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class NonRepeatingCharacter {
    public static void main(String[] args){

         String input = "Programming";
         char[] ch = input.toCharArray();
         HashMap<Character,Integer> mapObj = new HashMap<Character,Integer>();
         for(char c : ch){
             if(mapObj.get(c)==null){
                 mapObj.put(c,1);
             }
             else{
                 mapObj.put(c, mapObj.get(c)+1);
             }
         }
         mapObj.entrySet().stream().filter(map -> map.getValue()==1).forEach(System.out::println);
         //System.out.println("Non repeating characters : " + nonRepeating);

    }
}
