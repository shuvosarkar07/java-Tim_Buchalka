/* 
Digit Sum Challenge

Problem Statement:
Write a method named sumDigits that has a single parameter named number, of type int, and returns an int.

Requirements:

    The method should only accept positive numbers.
    If a negative number is passed, return -1 (indicating an invalid input).
    The method should extract each digit from the number and compute the sum of its digits.
    If the input is a single-digit number, return the number itself.

Examples:

    sumDigits(125) → 1 + 2 + 5 = 8 (returns 8)
    sumDigits(1000) → 1 + 0 + 0 + 0 = 1 (returns 1)
    sumDigits(9) → 9 (returns 9)
    sumDigits(-5) → -1 (returns -1)
*/


public class DigitSum {
    public static void main(String[] args) {
        System.out.println(sumDigits(-44)); 
        System.out.println(sumDigits(242)); 
        System.out.println(sumDigits(22)); 
        System.out.println(sumDigits(3)); 
    }

    public static int sumDigits(int num) {
        if (num < 0) return -1; 
        if (num < 10) return num;

        int numSum = 0;
        while (num > 9) {
            numSum += num % 10; 
            num /= 10; 
        }

        return numSum;
    }
}








