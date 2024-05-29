//Write a program to find the index of a target value in a sorted array. 
//If the target is not found, return the index where it would be if it were inserted in order.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TargetIndex {
    public static void main(String[] args) throws IOException {
        System.out.print("Enter the array elements separated by space : ");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> h = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .toList();
        int[] arr = h.stream().mapToInt(i -> i).toArray();
        Arrays.sort(arr);
        System.out.print("Enter the target value : ");
        int target = Integer.parseInt(bufferedReader.readLine());
        //Simple Traverse Approach
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target || arr[i] > target) {
                System.out.println("Target index : " + i);
                break;
            } else if (i == arr.length - 1) {
                System.out.println("Target index : " + arr.length);
            }
        }

        //Binary Search Approach
        //System.out.println("Index of the target value : " + searchInsert(arr, target));
    }

    // static int searchInsert(int[] nums, int target) {
    //     int low = 0;
    //     int high = nums.length - 1;
    //     while (low <= high) {
    //         int mid = low + (high - low) / 2;
    //         if (nums[mid] == target) {
    //             return mid;
    //         } else if (nums[mid] < target) {
    //             low = mid + 1;
    //         } else {
    //             high = mid - 1;
    //         }
    //     }
    //     return low;
    // }

}
