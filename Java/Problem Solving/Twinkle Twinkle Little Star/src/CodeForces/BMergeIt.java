package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;


public class BMergeIt {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int test = in.nextInt();
        while (test-- != 0) {
            int n = in.nextInt();
            int array[] = new int[n];
            int a =0,b=0,c=0;
            for(int i=0;i<n;i++)
            {
                array[i]= in.nextInt();
                if(array[i]%3==0)
                    a++;
                else if(array[i]%3==1)
                    b++;
                else
                {
                    c++;
                }
            }
            int temp = Math.min(b,c);
            a+=temp;
            if(temp==b)
            {
                c-=temp;
                c/=3;
                a+=c;
            }
            else
            {
                b-=temp;
                b/=3;
                a+=b;
            }
          out.println(a);
        }



        }
    }


