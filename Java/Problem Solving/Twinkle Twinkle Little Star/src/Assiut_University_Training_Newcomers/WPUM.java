package Assiut_University_Training_Newcomers;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class WPUM {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int n = in.nextInt();
        int count=0;
        for (int i = 1; i <=1000 ; i++) {
            if(count==n)break;
            if(i%4==0)
            {
                out.println("PUM");
                count++;
            }
            else
                out.print(i+" ");


        }
    }
}
