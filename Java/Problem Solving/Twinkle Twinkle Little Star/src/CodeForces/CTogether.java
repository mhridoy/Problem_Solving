package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class CTogether {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int n = in.nextInt();
        int counter[] = new int[1000002];
        for(int i =0; i<n;i++){
            int x = in.nextInt();
            counter[x]++;
            counter[x+1]++;
            counter[x+2]++;
        }
        int count=0;
        for (int i = 0; i <counter.length ; i++) count=Math.max(count,counter[i]);
        out.print(count);
        
    }
}
