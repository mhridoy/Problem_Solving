package UVA;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class Hartals {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int test = in.nextInt();
        while(test-- !=0)
        {
            int days = in.nextInt();
            int party = in.nextInt();
            int hartals[]= new int[party];
            int counter[] = new int[days+100];
            for (int i = 0; i <party ; i++) {
                hartals [i] = in.nextInt();
            }
            for (int i = 0; i <party ; i++) {
                if(days>hartals[i])
                    fillTheArray(hartals[i],days,counter);
            }
            int working_days=0;
            for (int i = 1; i <=days ; i++) {
                if(counter[i]>0)working_days++;
            }
            out.println(working_days);
        }
    }

    private void fillTheArray(int hartal, int days, int[] counter) {
        int x =1;
        for (int i =1 ; i <=days ; i++) {

            x=i*hartal;
            if(x>days)break;
            counter[x]++;
            if((x+1)%7==0 )
            {

                counter[x]=0;
                counter[x+1]=0;
            }
            else if(x%7==0){
                counter[x]=0;
                counter[x-1]=0;
            }
        }
    }
}
