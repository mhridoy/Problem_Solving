package AtCoder;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class BGreatOceanView {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int n = in.nextInt();
        int array []  = new int[n];
        for (int i = 0; i <n ; i++) {
            array[i]= in.nextInt();
        }
        int count=0;
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n-1 ; j++) {
                if(i!=j)
                if(array[i]<=array[j])count++;
            }
        }
        out.println(count);
    }
}
