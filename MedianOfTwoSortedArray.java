// Write a program to find the median of two sorted arrays.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MedianOfTwoSortedArray {
    public static void main(String[] args) throws IOException {
        System.out.print("Enter the array elements separated by space for Array 1 : ");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> h1 = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .toList();
        int[] arr1 = h1.stream().mapToInt(i -> i).toArray();
        System.out.print("Enter the array elements separated by space for Array 2 : ");
        List<Integer> h2 = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .toList();
        int[] arr2 = h2.stream().mapToInt(i -> i).toArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int[] arr3 = new int[arr1.length + arr2.length];
        int j = 0;
        for (int i : arr1) {
            arr3[j] = i;
            j++;
        }
        for (int i : arr2) {
            arr3[j] = i;
            j++;
        }
        Arrays.sort(arr3);
        int n = arr3.length - 1;
        double f = Math.floor((double) n / 2);
        double c = Math.ceil((double) n / 2);
        double m = (double) (arr3[(int) f] + arr3[(int) c]) / 2;
        System.out.println("Median of the two sorted arrays : " + m);
    }
}
