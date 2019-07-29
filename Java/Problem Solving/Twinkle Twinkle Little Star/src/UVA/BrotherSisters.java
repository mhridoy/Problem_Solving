package UVA;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class BrotherSisters {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int test = in.nextInt();
        while(test-- !=0)
        {
            long n = in.nextLong();
            long q = in.nextLong();
            long array[] = new long[(int)n];
            long max =0;
            for (int i = 0; i <n ; i++) {
                array[i]= in.nextLong();
                if(max<array[i] && (array[i]%2==1))max =array[i];
            }
            for(int i =0; i<q;i++)
            {
                long x = in.nextLong();

                out.println(x&max);

            }
        }
    }
}
