//Write a program to determine if the input string is valid. The brackets must close in the correct order

import java.util.Scanner;
import java.util.Stack;

public class ValidParanthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.next();
        
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                System.out.println("Invalid");
                return;
            }
        }

        if(stack.isEmpty()) {
            System.out.println("Valid");
        }
    }
}
