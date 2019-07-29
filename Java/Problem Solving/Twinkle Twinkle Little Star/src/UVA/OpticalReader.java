package UVA;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class OpticalReader {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        while (in.hasNext())
        {
            int test = in.nextInt();
            if(test==0)return;
            while(test-- !=0)
            {
                int a = in.nextInt(),b=in.nextInt(),c=in.nextInt(),d=in.nextInt(),e=in.nextInt();
                int array[] ={a,b,c,d,e};
                //boolean flag =true;

                int count=0,index=0,cc=0;
                for (int i = 0; i <array.length ; i++) {
                    if(array[i]<=127){
                        count++;
                        index=i;
                        //if(count==2)break;

                    }
                    else cc++;
                }
                if(count<=1&&cc!=5)
                {
                    if(index==0)out.println('A');
                    else if(index==1)out.println('B');
                    else if(index==2)out.println('C');
                    else if(index==3)out.println('D');
                    else out.println('E');
                }
                else out.println('*');
            }
        }
    }
}
