package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class ADiceRolling {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int queries = in.nextInt();
        while (queries --!=0)
        {
                int points = in.nextInt();
                int times_of_rolls = points / 2;
                out.println(times_of_rolls);


        }
    }
}
