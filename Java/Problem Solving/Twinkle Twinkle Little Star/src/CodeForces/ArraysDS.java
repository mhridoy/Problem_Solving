package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class ArraysDS {
    public void solve(int testNumber, InputReader in, PrintWriter out) {

        int test= in.nextInt();
        int array [] = new int[test];
        for (int i = 0; i < test; i++) {
            array[i]=in.nextInt();
        }
        for (int i = test-1; i >=0 ; i--) {
            if(i!=0)
            out.print(array[i]+" ");
            else
                out.println(array[i]);
        }
    }
}
