package CollectionProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountOccurrences 
{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 3, 3, 4));
        
        Map<Integer, Integer> countMap = new HashMap<>();
        
        for (int num : list) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        
        System.out.println("Element count: " + countMap);
    }
}
