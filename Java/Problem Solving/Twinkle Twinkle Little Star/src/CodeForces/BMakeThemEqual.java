package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class BMakeThemEqual {

    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int test = in.nextInt();
        int array [] = new int[test];
        for (int i = 0; i <test ; i++) {
            array[i]= in.nextInt();
        }
        Arrays.sort(array);
        int a = array[test-1]-array[0];
        int b =0;
        if(a%2==0){
           b= a/2;
        }
        else {
            b = a;
        }
        int extra = b+array[0];
        boolean flag = false;
        for (int i = 1; i <test ; i++) {
            if(array[i]+b!=extra && array[i]-b !=extra && array[i]!=extra){
                flag=true;
                break;
            }
        }


         if(flag){
            out.print(-1);
        }
        else if(a%2==0 )
            out.print(a/2);
        else
            out.print(a);
    }
}
