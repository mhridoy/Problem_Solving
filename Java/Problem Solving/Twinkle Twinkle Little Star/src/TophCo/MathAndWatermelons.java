package TophCo;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class MathAndWatermelons {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int watemelones = in.nextInt();
        int numofpeople = in.nextInt();
        out.println(watemelones%numofpeople);
    }
}
