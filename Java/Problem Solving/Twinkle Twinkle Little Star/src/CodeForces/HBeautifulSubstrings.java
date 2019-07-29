package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class HBeautifulSubstrings {
    public void solve(int testNumber, InputReader in, PrintWriter out) {

        int test = in.nextInt();
        while (test-- !=0)
        {
            int n  = in.nextInt();
            int m = in.nextInt();
            int k = in.nextInt();
            String a = in.nextLine();
            String b = in.nextLine();
            String temp [] = subString(a.toCharArray(),a.length());
            for (String s : temp) {
                out.println(s);
            }
        }
    }
    static String [] subString(char str[], int n) {
        // Pick starting point
        String temp ="";
        String temp1[]  = new String[100000];
        int index=0;
        for (int len = 1; len <= n; len++) {
            // Pick ending point
            for (int i = 0; i <= n - len; i++) {
                //  Print characters from current
                // starting point to current ending
                // point.
                int j = i + len - 1;
                for (int k = i; k <= j; k++) {
                    temp+=str[k];
                    //System.out.print(str[k]);
                }
                temp1[index++]=temp;


                //System.out.println();
            }
        }
        return temp1;
    }
}
