package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class CPrefixSumPrimes {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
    int n = in.nextInt();
    int array[] = new int[n+1];
    //out.print(array[n]);
    int odd=0,even=0;
        for (int i = 1; i <=n ; i++) {
            array[i]= in.nextInt();
            if(array[i]==1)odd++;

        }
        even=n-odd;
        if(even>0){
            out.print("2 ");
            even--;
        }
        out.println(even);
        if(odd>0){
            out.print("1 ");
            odd--;
        }
        out.println(odd);
        for (int i = 1; i <=even ; i++) {
            out.print("2 ");
        }
        for (int i = 1; i <=odd ; i++) {
            out.print("1 ");
        }
    }
}
