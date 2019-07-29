package CodeChef;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class HApreciousgame {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int test = in.nextInt();
        while (test-- != 0) {
            double D = in.nextDouble();
            double U = in.nextDouble();
            int n = in.nextInt();
            double curr = D * U;
            int count = 1, Ans = 0;
            while (n-- != 0) {

                double M = in.nextDouble();
                double R = in.nextDouble();
                double C = in.nextDouble();
                C /= M;
                double calculate = R * U + C;
                if (calculate < curr) {
                    curr = calculate;
                    Ans = count;
                }
                count++;
            }
            out.println(Ans);
        }
    }
}
