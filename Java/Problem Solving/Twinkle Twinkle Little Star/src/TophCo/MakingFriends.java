package TophCo;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class MakingFriends {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int number = in.nextInt();
        int count=0;
        for (int i = 1; i <=number ; i++) {
            if(number%i==0 &&number!=i)
                count++;
        }
        out.println(count);

    }
}
