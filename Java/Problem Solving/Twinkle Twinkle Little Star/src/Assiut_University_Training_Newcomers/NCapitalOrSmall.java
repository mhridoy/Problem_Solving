package Assiut_University_Training_Newcomers;

import Fast_IO.InputReader;
import java.io.PrintWriter;


public class NCapitalOrSmall {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        char  input = in.next().charAt(0);
        if(check(input))
            out.println("IS CAPITAL");
        else
                out.println("IS SMALL");
    }
    static  boolean check(char c )
    {
        if(c>=65 && c<=90) return true;
        else
            return false;
    }
}
