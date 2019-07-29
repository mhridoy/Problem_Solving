package TophCo;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class FormattedNumbers {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        long number = in.nextLong();
        int  count= howmanynumbers(number);
        if(count==1 ||count==2 ||count==3)
            out.println(number);
        else if(count==4)
        {
            long qou= number/1000;
            long rem = number%1000;
            if(rem==0)
            out.println(qou+","+000);
            else if(howmanynumbers(rem)==2)
                out.println(qou+","+"0"+rem);
            else
                out.println(qou+" "+rem);
        }
        else if(count==5)//12,234
        {
            long qou= number/1000;
            long rem = number%1000;
            if(rem==0)
                out.println(qou+","+000);
            else if(howmanynumbers(rem)==2)
                out.println(qou+","+"0"+rem);
            else
                out.println(qou+" "+rem);
        }
        else if(count==6)//1,22,343
        {
            long qou_1= number/100000;
            number= number%100000;
            if(number==0)
            {
                out.println(qou_1+","+00+","+000);
                return;
            }

            long qou_2= number/1000;
            long rem = number%1000;
            if(rem==0)
                out.println(qou_1+","+qou_2+","+000);
            else if(howmanynumbers(rem)==2)
                out.println(qou_1+","+qou_2+","+"0"+rem);
            else
                out.println(qou_1+","+qou_2+","+rem);
        }
        else if(count==7)//1,171,123
        {
            long qou_1= number/1000000;
            number= number%1000000;
            if(number==0)
            {
                out.println(qou_1+","+000+","+000);
                return;
            }
            //else if(howmanynumbers(number)==)

            long qou_2= number/1000;
            long rem = number%1000;
            if(rem==0)
                out.println(qou_1+","+qou_2+","+000);
            else if(howmanynumbers(rem)==2)
                out.println(qou_1+","+qou_2+","+"0"+rem);
            else
                out.println(qou_1+","+qou_2+","+rem);
        }
        //out.println(count);
    }

    private int howmanynumbers(long number) {
       int count=0;
        while(number!=0)
        {
            long rem= number%10;
            number=number/10;
            ++count;
        }
        return count;
    }
}
