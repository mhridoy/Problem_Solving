package UVA;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class ReverseAndAdd {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int test = in.nextInt();
        while(test -- !=0)
        {
            long number = in.nextLong();
            int addition =0;

            while (!checkPalinedrome(number))
            {
                long rev = revesenumber(number);
                long sum = rev+number;
                ++addition;
                number=sum;
            }
            out.println(addition +" "+ number);
        }
    }

    private long revesenumber(long number) {

        long temp=number;
        long revese=0;
        while(number!=0){
            long remainder=number%10;
            revese=(revese*10)+remainder;
            number=number/10;
        }
        return revese;

    }

    private boolean checkPalinedrome(long number) {
        long temp=number;
        long sum=0;
        while(number!=0){
            long remainder=number%10;
             sum=(sum*10)+remainder;
            number=number/10;
        }
        if(temp==sum)return true;
        else return false;
    }
}
