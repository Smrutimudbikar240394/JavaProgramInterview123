package AllPrograms;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int num=9474;
        
        // Find the number of digits
        int originalNum = num;
        int numDigits = 0;
        while (num != 0) {
            num /= 10;
            numDigits++;
        }
        
        // Calculate the sum of each digit raised to the power of numDigits
        int sum = 0;
        num = originalNum;
        while (num != 0) {
            int digit = num % 10;
            sum += Math.pow(digit, numDigits);
            num /= 10;
        }
        
        // Check if the sum is equal to the original number
        if (sum == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is not an Armstrong number.");
        }
        
       
    }
}