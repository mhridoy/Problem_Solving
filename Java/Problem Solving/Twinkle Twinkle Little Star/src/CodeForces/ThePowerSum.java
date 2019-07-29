package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class ThePowerSum {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int p = in.nextInt();
        int q = in.nextInt();
        out.println(power(p,q,1));
    }
    static int power(int X,int N,int num){
        if(Math.pow(num,N)<X)
            return power(X,N,num+1)+power((int) (X-Math.pow(num,N)),N,num+1);
        else if(Math.pow(num,N)==X)
            return 1;
        else
            return 0;
    }
}
