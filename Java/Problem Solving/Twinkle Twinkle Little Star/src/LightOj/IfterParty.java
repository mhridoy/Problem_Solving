package LightOj;

import Fast_IO.InputReader;
import java.io.PrintWriter;




public class IfterParty {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int test = in.nextInt();
        int index=0;
        while (test-- !=0)
        {
            int ate = in.nextInt();
            int left = in.nextInt();
            int difference = ate-left;
            if(difference<=left)out.println(String.format("Case %d: impossible",++index));
            else
            {
                out.print(String.format("Case %d: ",++index));
                    for (int i = 1; i*i<= difference; i++) {

                    }

            }

        }
    }

    private boolean isPrime(int difference) {
        for (int i = 2; i *i<difference; i++)
            if(difference%i==0)return false;
        return true;
    }

    private int check(int i, int difference) {
        if(i==difference)return 1;
        else
            return 2;
    }
}
