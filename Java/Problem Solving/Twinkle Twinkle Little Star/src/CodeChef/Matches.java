package CodeChef;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class Matches {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
    long test = in.nextLong();
    while (test--!=0){
        long a= in.nextLong();
        long b = in.nextLong();
        if(a==1 || b==1 || a==b){
            long c = Math.abs(a-b);
            if(c%2==0)
                out.println("Ari");
            else
                out.println("Rich");

        }
        else if(a%b==0 || b%a==0){
            out.println("Ari");
        }
        else {
            long c = Math.abs(a-b);
            if(a%c==0&b%c==0)out.println("Rich");
            else
                out.println("Ari");
        }
    }
    }
}
