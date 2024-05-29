//: Write a program that removes all instances of a given value in-place and returns the new length of the array.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

public class RemoveAllInstance {
    public static void main(String[] args) throws IOException {
        System.out.print("Enter the array elements separated by space : ");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> h = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .toList();
        int[] arr = h.stream().mapToInt(i -> i).toArray();
        System.out.print("Enter the value to remove : ");
        int val = Integer.parseInt(bufferedReader.readLine());
        System.out.println("Final length of the array : " + (arr.length - count(arr, val)));
    }

    static int count(int[] arr, int val) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) {
                count++;
            }
        }
        return count;
    }
}
