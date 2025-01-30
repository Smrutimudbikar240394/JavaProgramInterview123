package CollectionProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListIntersection 
{
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(4, 5, 6, 7));
        
        list1.retainAll(list2); // Retains only the elements that are in both lists
        
        System.out.println("Intersection: " + list1);
    }
}