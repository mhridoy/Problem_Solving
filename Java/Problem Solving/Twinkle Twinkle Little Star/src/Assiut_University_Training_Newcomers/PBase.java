package Assiut_University_Training_Newcomers;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class PBase {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        long n = in.nextLong();
        while(n-- !=0)
        {
            long x = in.nextLong();
            //long binary = ConverBinary(x);
            String reverse = Binary(x);
            out.println(Binary(x));
        }
    }

    private String Rev(String reverse) {
        String temp ="";
        for (int i = reverse.length()-1; i >=0 ; i--) {
            temp+=reverse.charAt(i);
        }
        return temp;
    }

    static long  ConverBinary(long number)
    {
        if(number==0)
            return 0;
        return number%2 + 10*ConverBinary(number/2);

    }
    static String Binary (long num)
    {
        String temp="";
        while (num != 0)
        {
           long  rem = num % 2;
            num /= 2;
            temp+=String.valueOf(rem);
        }
        return temp;
    }
}
