package UVA;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class CodeNumber {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        long test = in.nextInt();
        while(test-- !=0)
        {
            while (in.hasNext())
            {
                String decode = in.nextLine();
                out.println(decode);
            }
        }
    }
}
