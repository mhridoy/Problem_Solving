package UVA;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class CodeRefactoring {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int test = in.nextInt();
        for(int i =1;i<=test;i++){
            int number = in.nextInt();
            int a=0;
            int b=0;
            int c =0;
            int d =0;
            int count=0;
            for (int j = 2; j <number ; j++) {
                if(number%j==0){
                    if(count==0) {
                        a = j;
                        b = number / j;
                    }
                    else{
                        c=j;
                        d=number/j;
                        break;
                    }
                    count++;
                }
            }
            out.println(String.format("Case #%d: %d = %d * %d = %d * %d\n",i,number,a,b,c,d));
        }
    }
}
