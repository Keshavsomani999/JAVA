📌 Question :

Consider an array, A, of length n. We can split A into contiguous segments called pieces and store them as another array, B. We consider the value of a piece in some array B to be (Sum of all numbers in the piece) x (length of the piece), and we consider the total value of some array B to be the sum of the values for all pieces in that B. Given A, find the total values for all possible 's, sum them together, and print this sum modulo (10^9 +7) on a new line.

📌 Explanation:

In this program, First I have to find all possible pairs of sub-array from the given array, and then I have to calculate the sum of that array multiplied by the size of that array. for that I take one for loop In this loop first I calculate left then right. After that, I add both left and right and minus the n-1th element of the powers array. After that, I apply mod and store it to sum variable. At last print the sum variable.

📌 Example:
📌 Input:

3
1 3 6

📌 Output:
73



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SummingPieces {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        long sum = 0;
        long[] powers2 = new long[n + 1];
        powers2[0] = 1;
        for (int i = 1; i <= n; i++)
            powers2[i] = (powers2[i - 1] << 1) % 1000000007;

        for (int i = 1; i <= n; i++) {
            long left = ((powers2[i] - 1) * powers2[n - i]) % 1000000007;
            long right = ((powers2[1 + n - i] - 1) * powers2[i - 1]) % 1000000007;
            long v = left + right - powers2[n - 1];
            sum = (sum + (v * in.nextLong())) % 1000000007;
        }
        System.out.println(sum);

    }
}
