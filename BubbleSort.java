// Given an array of N integers, write a program to implement the Bubble Sorting algorithm.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

public class BubbleSort {
    public static void main(String[] args) throws IOException {
        System.out.print("Enter the array elements separated by space : ");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> h = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .toList();
        int[] arr = h.stream().mapToInt(i -> i).toArray();
        bubbleSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
