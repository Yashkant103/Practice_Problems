// Given a string s, reverse the words of the string.
// Example:
// Input: “this is an amazing program”
// Output: “program amazing an is this”
public class ReverseString {
    public static void main(String[] args) {
        String input = "this is an amazing program";
        String reversed = reverseWords(input);
        System.out.println(reversed);
    }
    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder reversed = new StringBuilder();
        
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]).append(" ");
        }
        return reversed.toString().trim();
    }
}