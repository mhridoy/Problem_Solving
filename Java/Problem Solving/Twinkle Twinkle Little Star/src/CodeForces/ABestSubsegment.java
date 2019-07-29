package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class ABestSubsegment {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int number = in.nextInt();
        int array [] = new int[number];
        for (int i = 0; i <number ; i++) {
            array[i]= in.nextInt();
        }
        int ans = array[0], ans_l = 0, ans_r = 0;
        int sum = 0, minus_pos = -1;

        for (int r = 0; r <number; ++r) {
            sum += array[r];
            if (sum > ans) {
                ans = sum;
                ans_l = minus_pos + 1;
                ans_r = r;
            }
            if (sum < 0) {
                sum = 0;
                minus_pos = r;
            }
        }
        out.println(ans_r-1);
    }
}
