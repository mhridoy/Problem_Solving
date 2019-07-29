package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;
import java.util.*;

public class ASushiForTwo {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int n = in.nextInt();
        int array [] = new int[n];
        for (int i = 0; i <n ; i++) {
            array[i]= in.nextInt();
        }
        int max=0;
        int count=0;
        int index=0;
        for (int i = 0; i <n ; i++) {
            if(array[i]==1)
            {
                count++;
                //out.println(count);
                if(max<=count){
                    max=count;
                    index=i;
                }
            }
            else if(array[i]==2)count=0;
        }
        int min=0;
        int sout=0;
        for (int i = index+1; i <n ; i++) {
            if(array[i]==2)
                sout++;
            else
                break;
        }
        int cout=0;
        for (int i = 0; i <index ; i++) {
            if(array[i]==2)count++;

        }
        //out.println(sout);
        //out.println(count);
         if(max==sout)out.println(max+sout);
         else if(max==count)out.println(max+count);
         else if(max<sout)out.println(max*2);
         else if(max<count)out.println(max*2);
         else if(max>sout)out.println(sout*2);
         else if(max>count)out.println(count*2);
       // out.println(sout);
    }



}
