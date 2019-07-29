package TophCo;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class Divisors {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
    int number = in.nextInt();
        for (int i = 1; i <=number ; i++) {
            if(number%i==0)
                out.println(i);
        }
    }

}
