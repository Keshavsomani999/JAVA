📌 Question :

You can perform the following operations on the string, a:

1. Capitalize zero or more of a's lowercase letters.

2. Delete all of the remaining lowercase letters in a.

Given two strings, a and b, determine if it's possible to make a equal to b as described. If so, print YES on a new line. Otherwise, print NO.

📌 Explanation:

In this program, first, I check if the length of string 'a' is less than that of string 'b', then I return "NO". Else, I create a multidimensional boolean array. Then, I take two nested for loops; the outer loop for the string 'a' and the inner loop for string 'b'. In this loop, I check if j is greater than i. If this condition is satisfied, then I store 'false' in the dp array at position i,j. Else, I check if i and j are equal to 0. If yes, then I store 'true' in the i,j position of the dp array. Else, I check if j is equal to 0. If yes, then I check if the character is lowercase and the value of dp at position i-1,j is equal to true. If both are true, then I store 'true' in the ith row and jth column position of the dp array. Else, I check if the character at i-1 is uppercase. If yes, then I check if the character at i-1 is equal to the character at j-1 and the value of dp at position i-1 and j-1 is true. If both are true, then I store 'true' in the ith row and jth column of the dp array. Else, if either of these are true or the value of dp at position i-1 and j is true, then I store 'true' in the ith row and jth column of the dp array. Else, I store 'false'. At last, if the value of dp at the a.length row and b.length column is true, then I return "YES", else "NO".

📌 Example:

📌 Input:

1
daBcd
ABC

📌 Output:

YES



import java.io.*;
import java.util.stream.*;

public class Abbreviation {

    public static String abbreviation(String a, String b) {
        if (a.length() < b.length()) {
            return "NO";
        }

        boolean[][] dp = new boolean[a.length() + 1][b.length() + 1];

        for (int i = 0; i <= a.length(); i++) {
            for (int j = 0; j <= b.length(); j++) {
                if (j > i) {
                    dp[i][j] = false;
                } else if (i == 0 && j == 0) {
                    dp[i][j] = true;
                } else if (j == 0) {
                    dp[i][j] = !Character.isUpperCase(a.charAt(i - 1)) && dp[i - 1][j];
                } else if (Character.isUpperCase(a.charAt(i - 1))) {
                    boolean tmp = a.charAt(i - 1) == b.charAt(j - 1) && dp[i - 1][j - 1];
                    dp[i][j] = tmp;
                } else {
                    boolean tmp = (Character.toUpperCase(a.charAt(i - 1)) == b.charAt(j - 1)) && dp[i - 1][j - 1];
                    boolean tmp2 = (tmp || dp[i - 1][j]);
                    dp[i][j] = tmp2;
                }
            }
        }

        return dp[a.length()][b.length()] ? "YES" : "NO";
    }

}

class Abbreviation_exe {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String a = bufferedReader.readLine();

                String b = bufferedReader.readLine();

                String result = Abbreviation.abbreviation(a, b);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
