package LightOj;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class SecretOrigins {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
    int test = in.nextInt();
    int index=0;
    while (test --!=0) {
        int Zephyr_Number = in.nextInt();
        out.println(String.format("Case %d: %d",++index,Integer.bitCount(Zephyr_Number)+Zephyr_Number));
    }
    }

}
