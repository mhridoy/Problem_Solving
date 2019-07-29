package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class DExtraElement {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int n = in.nextInt();
        int ar[]= new int[n+1],a[]= new int [n+1];
        for(int i = 0;i<n;i++) ar[i]=in.nextInt();
        for(int i = 0;i<n;i++) a[i] = ar[i];
        Arrays.sort(a);

    }
}
