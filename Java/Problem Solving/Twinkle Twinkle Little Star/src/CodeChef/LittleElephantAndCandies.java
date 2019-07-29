package CodeChef;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class LittleElephantAndCandies {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int test_case = in.nextInt();
        while (test_case--!=0) {
            int no_of_elephants = in.nextInt();
            int no_of_candies = in.nextInt();
            int make_all_elephants = 0;
            for (int i = 0; i < no_of_elephants; i++) {
                int x = in.nextInt();
                make_all_elephants += x;
            }
            if (make_all_elephants <= no_of_candies)
                out.println("Yes");
            else
                out.println("No");
        }
    }
}
