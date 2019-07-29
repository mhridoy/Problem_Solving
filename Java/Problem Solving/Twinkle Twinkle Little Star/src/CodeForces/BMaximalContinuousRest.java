package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class BMaximalContinuousRest {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int test=  in.nextInt();

        int max=0;
        int count=0;
        int array[] = new int[2*test];
        int len=test;
        for (int i = 0; i <test ; i++) {
                //int x = in.nextInt();
                array[i]=in.nextInt();
                array[len]=array[i];
                len++;


        }
        for (int i = 0; i <2*test ; i++) {

            if(array[i]==1)
            {
                count = count+1;
                if(count>max)
                    max = count;
            }
            else if(array[i]==0)
                count = 0;
        }





/*
        if(array[0]==1 && array[1]==1 &&array[2]==1 && array[(int)test-1]==1)
            out.println(Math.max(4,max));
        else if(array[0]==1 && array[1]==1 && array[(int)test-1]==1)
            out.println(Math.max(3,max));
       else if(array[0]==1 && array[(int)test-1]==1)
            out.println(Math.max(2,max));
*/



        out.print(max);
    }
}
