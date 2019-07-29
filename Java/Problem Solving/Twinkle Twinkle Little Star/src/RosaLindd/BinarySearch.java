package RosaLindd;

import Fast_IO.InputReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class BinarySearch {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();
        int array [] = new int[n];
        for (int i = 0; i <n ; i++) {
            array[i] = in.nextInt();
        }
        Arrays.sort(array);
        for (int i = 0; i <m ; i++) {
            int x = in.nextInt();
            int ans = Arrays.binarySearch(array,x);
            if(i==m-1) {
                if (ans < 0)
                    out.print(-1);
                else
                    out.print(ans+1);
            }
            else
            {
                if (ans < 0)
                    out.print(-1 + " ");
                else
                    out.print((ans + 1) + " ");
            }
        }
    }

}
