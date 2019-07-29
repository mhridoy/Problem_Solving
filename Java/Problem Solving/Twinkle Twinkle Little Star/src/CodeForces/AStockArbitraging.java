package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class AStockArbitraging {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
    int n = in.nextInt(),m = in.nextInt(),r= in.nextInt();
    int array[] = new int[n];
    int crray[] = new int[m];
        for (int i = 0; i <n ; i++) {
            array[i]= in.nextInt();
        }
        for (int i = 0; i <m ; i++) {
            crray[i]= in.nextInt();
        }
        Arrays.sort(array);
        Arrays.sort(crray);
        int count=r/array[0];
        int old =r;
        r%=array[0];
        r+=count*crray[m-1];
        out.println(Math.max(r,old));
    }
}
