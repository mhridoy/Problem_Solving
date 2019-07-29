package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class QTheBest {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        long array [] = new long[4];
        long min =Long.MAX_VALUE;
        long index=0;
        for (int i = 0; i <4 ; i++) {
            array[i]= in.nextLong();
            if(array[i]<min){
                min=array[i];
                index=i;
            }
        }
        int count=0;
        for(long x : array)
        {
            if(x==min) count++;
        }
        if(count>1)
            out.println("We are the best");
        else if(index==0)
            out.println("Amr");
        else if(index==1)
            out.println("Waleed");
        else if(index==2)
            out.println("Mustafa");
        else if(index==3)
            out.println("Youssef");


    }
}
