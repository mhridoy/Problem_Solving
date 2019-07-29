package Assiut_University_Training_Newcomers;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class TPrintTheSumOfAllConsecutiveOddNumbersFromX {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int test = in.nextInt();
        while(test -- !=0)
        {
            int x = in.nextInt();
            int y = in.nextInt();
            int count=0;
            int sum=0;
            if(x%2==0) x++;
            else x=x;
            for (int i = x; i <=200 ; i++) {

                if(count==y)break;
                if(i%2!=0 ){
                    sum+=i;
                    count++;
                }


            }
            out.println(sum);
        }
    }
}
