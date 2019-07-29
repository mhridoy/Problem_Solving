package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class AMahmoudAndEhabAndTheEvenOddGame {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        long favourite_number = in.nextLong()  ;

        if(favourite_number%2==0) out.printf("Mahmoud\n");
        else
            out.printf("Ehab\n");
    }
}
