package CollectionProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicates {
	    public static void main(String[] args) {
	        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 4, 5, 1));
	        Set<Integer> duplicates = new HashSet<>();
	        Set<Integer> seen = new HashSet<>();
	        
	        for (int num : list) {
	            if (!seen.add(num)) {
	                duplicates.add(num);
	            }
	        }
	        
	        System.out.println("Duplicates: " + duplicates);
	    }
	}

