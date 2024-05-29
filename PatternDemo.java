// 1   1   
// 12  21  
// 123 321 
// 12344321

import java.util.Scanner;

public class PatternDemo {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int space = ((n - 1) * 2) - 2;

        for (int i = 1; i <= n - 1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = 1; j <= space/2; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 1; j <= space/2; j++) {
                System.out.print(" ");
            }
            System.err.println();
            space -= 2;
        }
    }
}
