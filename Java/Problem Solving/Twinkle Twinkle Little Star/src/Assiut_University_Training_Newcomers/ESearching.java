package Assiut_University_Training_Newcomers;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class ESearching {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int test = in.nextInt();
        long array [] = new long[test];
        for (int i = 0; i <test ; i++) {
            array[i] = in.nextLong();

        }
        long x = in.nextLong();
        boolean flag = false;
        for (int i = 0; i <test ; i++) {
            if(array[i]==x)
            {
                x=i;
                flag=true;
                break;
            }
        }
        if(flag)out.println(x);
        else
            out.println("-1");

    }
}
