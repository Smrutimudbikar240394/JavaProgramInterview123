package ArrayProgram;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = 2;  // Number of positions to rotate

        // Rotate the array
        int[] rotatedArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            rotatedArr[(i + n) % arr.length] = arr[i];
        }

        System.out.print("Rotated Array: ");
        for (int num : rotatedArr) {
            System.out.print(num + " ");
        }
    }
}