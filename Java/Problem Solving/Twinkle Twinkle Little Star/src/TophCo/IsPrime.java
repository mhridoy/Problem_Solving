package TophCo;

import Fast_IO.InputReader;
import java.io.PrintWriter;
import java.math.BigInteger;

public class IsPrime {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int number = in.nextInt();
        out.print(isPrimeOrNot(number));

    }
    public static String isPrimeOrNot(int num)
    { if (num < 0) { return "No"; }
    if (num == 0 || num == 1) { return "No"; }
    if (num == 2 || num == 3) { return "Yes"; }
    if ((num * num - 1) % 24 == 0) { return "Yes"; }
    else { return "No"; }
    }

}
