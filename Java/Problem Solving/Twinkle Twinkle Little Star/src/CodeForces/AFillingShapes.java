package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class AFillingShapes {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
    int n = in.nextInt();
    solve(n,out);
    }
    static void solve(int n,PrintWriter out){
        int output=0;
        if(n%2==1){
            output=0;
        }
        else{
            n/=2;
            output=1<<n;
        }
        out.println(output);
    }
}
