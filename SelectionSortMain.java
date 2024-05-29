// Given an array of N integers, write a program to implement the Selection sorting algorithm.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class SelectionSortMain {
    public static void main(String[] args) throws IOException {
        // int[] arr = { 64, 25, 12, 22, 11 };
        System.out.print("Enter the array elements separated by space : ");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> h = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .toList();
        int[] arr = h.stream().mapToInt(i -> i).toArray();
        SelectionSort obj = new SelectionSort();
        obj.sort(arr);
        obj.printArray(arr);
    }
}

class SelectionSort {
    void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min_ind = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min_ind] > arr[j]) {
                    min_ind = j;
                }
            }
            int temp = arr[min_ind];
            arr[min_ind] = arr[i];
            arr[i] = temp;
        }
    }

    void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}