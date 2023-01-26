📌 Question :

Christy is interning at HackerRank. One day she has to distribute some chocolates to her colleagues. She is biased toward her friends and plans to give them more than others. One of the program managers hears of this and tells her to make sure everyone gets the same number.

To make things difficult, she must equalize the number of chocolates in a series of operations. For each operation, she can give 1,2, or  5 pieces to all but one colleague. Everyone who gets a piece in a round receives the same number of pieces.

Given a starting distribution, calculate the minimum number of operations needed so that every colleague has the same number of pieces.

📌 Explanation:

In this program First I create one possibility array of size 5 because there are always five or less than five possibilities. Then I find the minimum value from the list. After that, I take one for a loop to check all possibilities. In this loop, I take one nested for each loop in that loop first I find the difference between the current element and the minimum element, and then by applying the formula I count the total step required to make the same number of chocolate as a minimum element have and then I add this steps into possibility array. after that, I decrement the minimum by one and again it finds the step and stores it into possibility arrays. At last, I return the minimum value from the possibility array.

📌 Example:
📌 Input:

4
2 2 3 7

📌 Output:

2



package Equal;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;
import java.util.Arrays;

public class Equal {

    public static int equal(List<Integer> arr) {
        int[] possibilities = new int[5];

        int minimum = Collections.min(arr);

        for (int i = 0; i < possibilities.length; i++) {

            for (int k : arr) {
                int diff = k - minimum;
                int stepsRequired = diff / 5 + (diff % 5) / 2 + ((diff % 5) % 2) / 1;
                possibilities[i] += stepsRequired;
            }
            minimum--;
        }

        return Arrays.stream(possibilities).min().getAsInt();
    }

}

class Equal_exe {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList());

                int result = Equal.equal(arr);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
