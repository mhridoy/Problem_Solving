package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class AAA {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int number = in.nextInt();
        int array [] = new int[number];
        for (int i = 0; i < number; i++) {
            array[i]= in.nextInt();
        }
        int count=1;
        int max=1;
        boolean flag= true;
        for (int i = 0; i <number-1 ; i++) {
            if(array[i]<=array[i+1])
            {
                ++count;
                //out.println(max);
                if(max<=count)max=count;
            }
            else
            {
                flag=false;
                count=1;
               //i=i+1;
            }
            //out.println(i);

        }
        if(flag)
        out.println(number);
        else {
            out.println(count);
        }

    }
}
