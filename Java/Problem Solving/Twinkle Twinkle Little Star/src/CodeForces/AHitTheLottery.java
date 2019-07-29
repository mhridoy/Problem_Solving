package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class AHitTheLottery {
    public void solve(int testNumber, InputReader in, PrintWriter out) {

            long dollors = in.nextLong();
            long count=0;
            while(dollors!=0)
            {

                if(dollors>=5 && dollors<10)
                {

                    long  temp= dollors/5;
                    dollors=dollors%5;
                    //if(n==0)
                    count=count +temp;
                    // out.printf("N: %d \n",n);
                    //count++;
                    //out.printf("5 Paisi\n");
                }

                else if(dollors<5){
                    dollors=dollors*1;
                    // out.printf("1 er N: %d \n",n);
                    count=count+dollors;
                    dollors=0;
                    //     out.printf("1 Paisi\n");
                }
                else  if(dollors>=10 && dollors<20)
                {
                    long  temp= dollors/10;
                    dollors=dollors%10;
                    //if(n==0)
                    count=count +temp;
                    //           out.printf("N : %d \n",n);
                    //count++;
                    //     out.printf("10 Paisi\n");
                }
                else if(dollors>=20 && dollors<100)
                {
                    long temp= dollors/20;
                    dollors=dollors%20;
                    //if(n==0)
                    count=count +temp;
                    //       out.printf("N: %d \n",n);
                    //count++;

                    // out.printf("20 Paisi\n");
                }

                else  if(dollors>=100)
                {
                    long temp= dollors/100;
                    dollors=dollors%100;
                    // printf("N: %d \n",n);

                    //if(n==0)
                    count=count +temp;

                    //count++;
                    //           out.printf("100 Paisi\n");
                }
            }
            out.printf("%d\n",count);


    }
}
