import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

public class LeaderElement {
    public static void main(String[] args) throws IOException {
        // int[] arr = { 16, 17, 4, 3, 5, 2 };
        System.out.print("Enter the array elements separated by space : ");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> h = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .toList();
        int[] arr = h.stream().mapToInt(i -> i).toArray();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    break;
                }
                if (j == arr.length - 1) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
        System.out.print(arr[arr.length - 1]);
    }
}