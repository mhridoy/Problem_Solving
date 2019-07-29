package Assiut_University_Training_Newcomers;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class NDigits {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int n  = in.nextInt();
        while(n-- !=0)
        {
            long x = in.nextLong();
            String temp ="";
            while(x!=0)
            {
                long rem = x%10;
                temp+=String.valueOf(rem);
                x/=10;

                //out.print(rem+" ");
            }
            printString(temp,out);
            out.println();
        }
    }

    private void printString(String temp, PrintWriter out) {
        for (int i = temp.length()-1; i >=0 ; i--) {
            if(i==0)
            out.print(temp.charAt(i));
            else
                out.print(temp.charAt(i)+" ");
        }
    }
}
