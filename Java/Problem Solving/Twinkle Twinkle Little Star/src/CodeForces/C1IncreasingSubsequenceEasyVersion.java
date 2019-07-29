package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class C1IncreasingSubsequenceEasyVersion {
    static final int MAXIMUM = 200000 + 10;
    static long[] array = new long[MAXIMUM];
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        long n = in.nextLong();
        for(int i = 0; i < n; i++)
            array[i] = in.nextLong();

        long l = 0, r = n - 1, cnt = 0, curr = 0;
        List<Character> ans = new ArrayList<Character>();
        List<Long> an = new ArrayList<Long>();

        while(l <= r)
        {
            if(array[(int)l] < array[(int)r])
            {
                if(an.size() == 0 || array[(int)l] >= an.get(an.size() - 1))
                {
                    an.add(array[(int)l]);
                    ans.add('L');
                    l++;
                }
                else if(an.size() == 0 || array[(int)r] >= an.get(an.size() - 1))
                {
                    an.add(array[(int)r]);
                    ans.add('R');
                    r--;
                }
                else
                    break;
            }
            else
            {
                if(an.size() == 0 || array[(int)r] >= an.get(an.size() - 1))
                {
                    an.add(array[(int)r]);
                    ans.add('R');
                    r--;
                }
                else if(an.size() == 0 || array[(int)l] >= an.get(an.size() - 1))
                {
                    an.add(array[(int)l]);
                    ans.add('L');
                    l++;
                }
                else
                    break;
            }
        }

        out.println(ans.size());
        for(int i = 0; i < ans.size(); i++)
            out.print(ans.get(i));
    }
}
