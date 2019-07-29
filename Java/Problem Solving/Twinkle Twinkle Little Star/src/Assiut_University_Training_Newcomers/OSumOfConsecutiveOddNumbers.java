package Assiut_University_Training_Newcomers;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class OSumOfConsecutiveOddNumbers {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int n = in.nextInt();
        while(n-- !=0)
        {
            int left = in.nextInt();
            int right = in.nextInt();
            int min = Math.min(left,right);
            int max = Math.max(left,right);
            int sum=0;
            for (int i = min+1; i <max ; i++) {
                if(i%2!=0)
                    sum+=i;
            }
            out.println(sum);
        }
    }
}
