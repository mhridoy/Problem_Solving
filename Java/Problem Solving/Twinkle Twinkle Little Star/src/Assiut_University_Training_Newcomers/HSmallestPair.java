package Assiut_University_Training_Newcomers;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class HSmallestPair {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int test = in.nextInt();
        while (test -- !=0)
        {
            int n = in.nextInt();
            long array [] = new long[n];
            for (int i = 0; i <n ; i++) {
                array[i]=in.nextLong();
            }
            long low = Long.MAX_VALUE;
            for (int i = 0; i <n ; i++) {
                for (int j = 0; j <n ; j++) {
                    if(i!=j)
                    if(array[i]+array[j]<low)low=array[i]+array[j];
                }
            }
            out.println(low);
        }
    }
}
