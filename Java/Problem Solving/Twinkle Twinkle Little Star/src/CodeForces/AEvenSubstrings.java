package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

public class AEvenSubstrings {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int test = in.nextInt();
        String s = in.nextLine();
        out.println(evenNumSubstring(s.toCharArray()));

    }
    int evenNumSubstring(char str[])
    {
        int len = str.length;
        int count = 0;

        for (int i = 0; i < len; i++)
        {
            int temp = str[i] - '0';
            if ((temp %2)==0)
                count += (i + 1);
        }

        return count;
    }

}
