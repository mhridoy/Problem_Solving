package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class UShape2 {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int n = in.nextInt();
        int star =1;
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n-i-1 ; j++) {
                out.print(" ");
            }
            for (int j = 0; j <star ; j++) {
                out.print("*");
            }
            star+=2;
            out.println();

        }
    }

}
