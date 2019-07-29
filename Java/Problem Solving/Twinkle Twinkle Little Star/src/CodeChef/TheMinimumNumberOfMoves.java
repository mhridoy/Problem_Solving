package CodeChef;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class TheMinimumNumberOfMoves {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int test_case= in.nextInt();
        while (test_case--!=0)
        {
            int numbers_of_workers = in.nextInt();
            int array [] = new int[numbers_of_workers];
            int min  =Integer.MAX_VALUE;
           for(int i =0;i<numbers_of_workers;++i) {
               array[i] = in.nextInt();
               if(array[i]<min)
                   min=array[i];
           }
           int turns = 0;
           for(int i =0;i<numbers_of_workers;i++)
           {
               turns+= Math.abs(array[i]-min);
           }
           out.println(turns);
        }
    }
}
