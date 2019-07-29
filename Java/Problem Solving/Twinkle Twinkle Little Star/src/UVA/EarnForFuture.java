package UVA;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class EarnForFuture {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int test = in.nextInt();
        int index=0;
        while(test -- !=0)
        {
            int number_of_cards=in.nextInt();
            int array[] = new int[number_of_cards];
            long max =0;
            for (int i = 0; i <number_of_cards ; i++) {
                array[i]= in.nextInt();
                if(max<array[i])max =array[i];
            }
            out.println(String.format("Case %d: %d",++index,max));
        }
    }
}
