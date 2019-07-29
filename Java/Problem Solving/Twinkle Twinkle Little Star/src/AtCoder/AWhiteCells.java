package AtCoder;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class AWhiteCells {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int rows = in.nextInt();
        int cols = in.nextInt();
        int h_row = in.nextInt();
        int h_col = in.nextInt();
        out.println((rows-h_row)*(cols-h_col));
    }
}
