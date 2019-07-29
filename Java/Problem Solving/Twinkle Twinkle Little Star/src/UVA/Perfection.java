package UVA;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class Perfection {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        out.print("PERFECTION OUTPUT\n");
        while (in.hasNext()){
            int x = in.nextInt();
            if(x==0)
                break;

            if(check(x)==x)
                out.println(String.format("%5d  PERFECT",x));
            else if (check(x)<x)
            out.println(String.format("%5d  DEFICIENT",x));
            else if(check(x)>x)
            out.println(String.format("%5d  ABUNDANT",x));


        }
        out.println("END OF OUTPUT");
    }
    static  int check (int x ){
        int sum=0;
        for (int i = 1; i <x ; i++) {
            if(x%i==0)
                sum+=i;
        }
        return sum;
    }
}
