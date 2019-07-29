package Assiut_University_Training_Newcomers;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class DEvenOddPositiveAndNegative {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int n = in.nextInt();
        int even=0;
        int odd =0;
        int pos =0;
        int neg =0;
        for (int i = 0; i <n ; i++) {
            int x = in.nextInt();
            if(x%2==0)even++;
             if (x%2!=0) odd++;
             if (x>0) pos++;
             if(x<0)neg++;

        }
        out.println(String.format("Even: %d\n" +
                "Odd: %d\n" +
                "Positive: %d\n" +
                "Negative: %d",even,odd,pos,neg));
    }
}
