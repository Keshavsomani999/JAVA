// 📌 Question :   

// We call an quadruple of positive integers,(W,X,Y,Z) , beautiful if the following condition is true:

// W^X^Y^Z != 0 

// Given A, B, C, and D, count the number of beautiful quadruples of the form (W,X,Y,Z) where the following constraints hold:

// 📍 1<=W<=A
// 📍 1<=X<=B
// 📍 1<=Y<=C
// 📍 1<=Z<=D

// When you count the number of beautiful quadruples, you should consider two quadruples as the same if the following are true:

// 📍 They contain the same integers.

// 📍 Number of times each integers occur in the quadruple is same.

// 📌 Explanation:

// In this program, First I store all values in one array and then I sort the array. After that, I take two nested loops for the last two numbers. In this loop first I calculate ai^bi and then I store this value if not present else update its value by incrementing by one in the map and incrementing the count by one. 

// Now same I do for the first two digits but the only difference is in the inner loop I check for w is lesser than or equal to a minimum of arr of 0 or x. After that, I take one for loop for removing duplicate pairs from the count. At last, I return the count.

// 📌 Example:
// 📌 Input:

// 1 2 3 4

// 📌 Output:

// 11



import java.io.*;
import java.util.*;

public class BeautifulQuadruples {

    static long beautifulQuadruples(int a, int b, int c, int d) {
        long count = 0;

        Map<Integer, Integer> map = new HashMap();

        int[] ar = new int[4];
        ar[0] = a;
        ar[1] = b;
        ar[2] = c;
        ar[3] = d;

        Arrays.sort(ar);

        long acc = 0;
        for (int ai = 1; ai <= ar[2]; ai++) {
            for (int bi = ai; bi <= ar[3]; bi++) {
                int xor = ai ^ bi;
                map.put(xor, map.getOrDefault(xor, 0) + 1);
                acc += 1L;
            }
        }

        for (int x = 1; x <= ar[1]; x++) {
            for (int w = 1; w <= Math.min(ar[0], x); w++) {
                int xor = w ^ x;
                count += acc - map.getOrDefault(xor, 0);
            }

            int y = x;
            for (int z = x; z <= ar[3]; z++) {
                int xor = y ^ z;
                map.put(xor, map.getOrDefault(xor, 0) - 1);
                acc -= 1L;

            }

        }
        return count;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] abcd = scanner.nextLine().split(" ");

        int a = Integer.parseInt(abcd[0].trim());

        int b = Integer.parseInt(abcd[1].trim());

        int c = Integer.parseInt(abcd[2].trim());

        int d = Integer.parseInt(abcd[3].trim());

        long result = beautifulQuadruples(a, b, c, d);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
