// Given row number r and column number c. 
// Print the element at position (r, c) in Pascal’s triangle.\
// 1
// 11
// 121
// 1331
// 14641  

import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        if (c > r) {
            System.out.println("Invalid Input");
            return;
        }
        pascalsTriangle(r, c);
    }

    static void pascalsTriangle(int r, int c) {
        int[][] pascal = new int[r][c];
        for (int i = 0; i < r; i++) {
            pascal[i] = new int[i + 1];
            pascal[i][0] = 1;
            pascal[i][i] = 1;
            for (int j = 1; j < i; j++) {
                pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
            }
        }
        //printPascal(r, pascal); //to print the pascal triangle
        System.out.println("\n" + pascal[r - 1][c - 1]);
    }
    //to print the pascal triangle
    // static void printPascal(int r, int[][] pascal) {
    //     for (int i = 0; i < r; i++) {
    //         for (int j = 0; j <= i; j++) {
    //             System.out.print(pascal[i][j] + " ");
    //         }
    //         System.out.println();
    //     }
    // }
}
