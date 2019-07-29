package UVA;

import Fast_IO.InputReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class PrimaryArithmetic {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int a = 0,b = 0;
        ArrayList<String> list = new ArrayList<String>();

        while( (a=in.nextInt())==-1 || (b=in.nextInt())==-1 || true){
            if(a==0 && b==0) break;

            int count = count(a,b);

            if(count==0)
                list.add("No carry operation.");
            else if(count==1)
                list.add("1 carry operation.");
            else
                list.add( count + " carry operations.");

        }

        for(String ans : list)
            out.println(ans);

    }
    private static int count(int a, int b) {

        int sum, carry = 0,count = 0;

        while ((a > 0) || (b > 0)) {
            sum = carry + (a % 10) + (b % 10);

            if (sum >= 10) count++;

            carry = sum / 10;
            a /= 10;
            b /= 10;
        }
        return count;
    }
}
