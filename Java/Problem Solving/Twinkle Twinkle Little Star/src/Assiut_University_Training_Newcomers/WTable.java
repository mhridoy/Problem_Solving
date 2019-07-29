package Assiut_University_Training_Newcomers;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class WTable {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int n = in.nextInt();
        if(n==11)
            out.println("Competitive programming");
        else if(n==61)
            out.println("Art of computer programming");
        else if(n==71)
            out.println("Introduction to algorithm");
        else if(n==29)
            out.println("Programming challenges");
        else
            out.println("Not found");
    }
}
