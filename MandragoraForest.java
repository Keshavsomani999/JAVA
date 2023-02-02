📌 Question :

The evil forest is guarded by vicious mandragoras. Garnet and her pet must make a journey through. She starts with 1 health point (s) and 0 experience points.

As she encounters each mandragora, her choices are:

1. Garnet's pet eats mandragora i. This increment s by 1 and defeats mandragora i.

2. Garnet's pet battles mandragora i. This increases p by s x H[I]  experience points and defeats mandragora i.

Once she defeats a mandragora, it is out of play. Given a list of mandragoras with various health levels, determine the maximum number of experience points she can collect on her journey.

📌 Explanation:

In this program, first I sort the list of health points and count the total health points. Then, I take three variables: the first is 'bestscore', initialized with 0, the second is 'eaten', initialized with 0, and the third is 's', initialized with the total health. After that, I take a while loop that runs until 's' is greater than 'bestscore'. In this loop, I first initialize 'bestscore' as 's' and then I subtract the 'eaten'th element of the 'nums' list from the total health. After that, I increment 'eaten' by 1 and then I calculate 1+ 'eaten' multiplied by the total health and assign it to 's'. At last, I print 'bestscore'.

📌 Example:

📌 Input:

3
3 2 2

📌 Output:

10











import java.io.*;
import java.util.*;

public class MandragoraForest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            sc.nextLine();
            
            long totalH = 0L;
            List<Long> nums = new ArrayList<Long>();
            String line = sc.nextLine();
            String[] tokens = line.split(" ");
            for (String s : tokens) {
                long nj = Long.parseLong(s);
                nums.add(nj);
                totalH += nj;
            }
            Collections.sort(nums);
            long bestScore = 0;
            int eaten = 0;
            long s = totalH;
            
            while (s > bestScore) {
                bestScore = s;
                totalH -= nums.get(eaten);
                eaten += 1;
                s = (1L + eaten) * totalH;
            }
            System.out.println(bestScore);
        }
    }
}
