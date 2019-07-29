package UVA;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class AllInAll {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        while(in.hasNext()) {

            String s = in.next();
            String t = in.next();
            boolean res = isSubSequence(s,t,s.length(),t.length());
            if(res)out.println("Yes");
            else out.println("No");
        }

    }
    static boolean isSubSequence(String str1, String str2, int m, int n)
    {
        // Base Cases
        if (m == 0)
            return true;
        if (n == 0)
            return false;

        // If last characters of two strings are matching
        if (str1.charAt(m-1) == str2.charAt(n-1))
            return isSubSequence(str1, str2, m-1, n-1);

        // If last characters are not matching
        return isSubSequence(str1, str2, m, n-1);
    }
}
