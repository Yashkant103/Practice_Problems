//Given an array of N integers. Find the elements that appear more than N/3 times in the array. 
//If no such element exists, return an empty vector

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class PrintN3Element {
    public static void main(String[] args) throws IOException {
        System.out.print("Enter the array elements separated by space : ");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> h = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .toList();
        int[] arr = h.stream().mapToInt(i -> i).toArray();
        // int[] arr = {1, 2, 2, 2, 3, 1, 1};
        List<Integer> li = new ArrayList<>(); 
        int threshold = arr.length / 3;
        for(int i:arr){
            if(count(arr, i) > threshold && !li.contains(i)){
                li.add(i);
            }
        }
        for(int i:li){
            System.out.print(i + " ");
        }
    }

    static int count(int[] arr, int num) {
        int count = 0;
        for (int i : arr) {
            if (i == num) {
                count++;
            }
        }
        return count;
    }
}
