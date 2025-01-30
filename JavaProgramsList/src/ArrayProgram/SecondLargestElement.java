package ArrayProgram;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {10, 25, 30, 50, 20};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Traverse the array to find the second largest element
        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        System.out.println("Second Largest Element: " + secondLargest);
    }
}

