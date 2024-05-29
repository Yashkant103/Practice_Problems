import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

public class ArrayReverse {
    public static void main(String[] args) throws IOException {
        System.out.print("Enter the array elements separated by space : ");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> h = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .toList();
        int[] arr = h.stream().mapToInt(i -> i).toArray();
        // reverse(arr);
        int[] arr1 = reverse1(arr);
        for (int i : arr1) {
            System.out.print(i + " ");
        }
    }

    //Simple Method to reverse an array (OPTIMAL WAY)
    public static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    //Reverse an array by taking new array
    public static int[] reverse1(int[] arr) {
        int[] arr1 = new int[arr.length];
        int j = 0;
        for(int i = arr.length - 1; i >= 0; i--) {
            arr1[j] = arr[i];
            j++;
        }
        return arr1;
    }
}
