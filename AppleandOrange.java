// 📌 Question :   

// Sam's house has an apple tree and an orange tree that yield an abundance of fruit. Using the information given below, determine the number of apples and oranges that land on Sam's house.
// In the diagram below:
// 📍 The red region denotes the house, where S is the start point, and T is the endpoint. The apple tree is to the left of the house, and the orange tree is to its right.
// 📍 Assume the trees are located on a single point, where the apple tree is at point a, and the orange tree is at point b.
// 📍 When a fruit falls from its tree, it lands d units of distance from its tree of origin along the x-axis. *A negative value of d means the fruit fell d units to the tree's left, and a positive value of d means it falls d  units to the tree's right. *

// 📌 Explanation:

// In this program, First I add a to all apple's positions, and same as orange I add the b and update the values. Then I take one for each loop for apple and check if the value is between the range of s and t. if the condition is satisfied then I increment the apple count by one and the same as for oranges if it's in a range then I increment the orange count. At last, I print the count.

// 📌 Example:
// 📌 Input:
// 7 11
// 5 15
// 3 2
// -2 2 1
// 5 -6

// 📌 Output:
// 1
// 1















import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class AppleandOrange {

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        for (int i = 0; i < apples.size(); i++) {
            apples.set(i, apples.get(i) + a);
        }
        for (int i = 0; i < oranges.size(); i++) {
            oranges.set(i, oranges.get(i) + b);
        }
        int ac = 0, oc = 0;
        for (Integer f : apples) {
            if (f >= s && f <= t) {
                ac++;
            }
        }
        for (Integer o : oranges) {
            if (o >= s && o <= t) {
                oc++;
            }
        }
        System.out.println(ac);
        System.out.println(oc);
    }

}















class AppleandOrange_exe {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int s = Integer.parseInt(firstMultipleInput[0]);

        int t = Integer.parseInt(firstMultipleInput[1]);

        String[] secondMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int a = Integer.parseInt(secondMultipleInput[0]);

        int b = Integer.parseInt(secondMultipleInput[1]);

        String[] thirdMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int m = Integer.parseInt(thirdMultipleInput[0]);

        int n = Integer.parseInt(thirdMultipleInput[1]);

        List<Integer> apples = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> oranges = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        AppleandOrange.countApplesAndOranges(s, t, a, b, apples, oranges);

        bufferedReader.close();
    }
}
