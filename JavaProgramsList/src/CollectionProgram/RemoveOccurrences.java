package CollectionProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RemoveOccurrences 
{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 2, 5, 6, 2));
        Integer elementToRemove = 2;
        
        list.removeAll(Collections.singleton(elementToRemove));
        
        System.out.println("List after removal: " + list);
    }
}