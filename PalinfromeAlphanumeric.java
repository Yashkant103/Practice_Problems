// Write a program to determine if a given string is a palindrome, considering 
// only alphanumeric characters and ignoring cases.
// Input: 
// "A man, a plan, a canal: Panama"
// "race a car"
// Output: 
// true
// false

import java.util.Scanner;

public class PalinfromeAlphanumeric {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.nextLine();
        System.out.println(isPalindrome(str));
    }

    static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (!Character.isLetterOrDigit(str.charAt(left))) {
                left++;
            } else if (!Character.isLetterOrDigit(str.charAt(right))) {
                right--;
            } else if (Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right))) {
                return false;
            } else {
                left++;
                right--;
            }
        }
        return true;
    }
}