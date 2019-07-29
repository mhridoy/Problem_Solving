package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class ARepeatingCipher {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int size = in.nextInt();
        int difference=0;
        String s = in.nextLine();
        int sum=0;
        //
        for(int i =0 ;i<s.length();i++)
        {

                sum += i;
            if(sum==size) break;
                //out.println(sum);
                out.print(s.charAt(sum));


        }

    }
}
