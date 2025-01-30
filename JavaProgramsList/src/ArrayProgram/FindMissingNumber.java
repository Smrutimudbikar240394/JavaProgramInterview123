package ArrayProgram;

public class FindMissingNumber 
{
	
	    public static void main(String[] args) {
	        int[] arr = {1, 2, 4, 5};
	        int n = 5;  // N is the size of the array (the largest number)

	        // Sum of first N numbers
	        int totalSum = n * (n + 1) / 2;

	        // Sum of elements in the array
	        int arraySum = 0;
	        for (int num : arr) {
	            arraySum += num;
	        }

	        // The missing number is the difference between totalSum and arraySum
	        int missingNumber = totalSum - arraySum;
	        System.out.println("Missing Number: " + missingNumber);
	    
	}


}
