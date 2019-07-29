package TophCo;

import Fast_IO.InputReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class IsPalindrome {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        String s = in.next();
        String temp = toreverse(s);
        if(s.equals(temp))
            out.println("Yes");
        else
            out.println("No");
    }

    private String toreverse(String s) {
        String temp="";
        for (int i = s.length()-1; i >=0 ; i--) {
            temp+=s.charAt(i);
        }
        return temp;
    }
}
