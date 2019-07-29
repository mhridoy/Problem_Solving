package AtCoder;

import Fast_IO.InputReader;

import java.io.PrintWriter;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CEnergyDrinkCollector {

    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int n = in.nextInt();
        long m = in.nextInt();
        List<Long> A =new LinkedList<>();
        List <Long> B = new LinkedList<>();
        List<Long> C = new LinkedList<>();
         for (int i = 0; i <n ; i++) {
            A.add(in.nextLong());
           B.add(in.nextLong());
           C.add(B.get(i));

            
        }
        Collections.sort(B);
        int index [] = new int[n];
        int bin=0;
        long sum=0;

        for (int i = 0; i <n ; i++) {
            if(sum==m)
                break;
            sum+=B.get(i);
            bin=i;
        }

        long sum_sum=0;
        int cin=0;
        for (int i = 0; i <bin ; i++) {
            for (int j = 0; j <n ; j++) {
                if(B.get(i)==C.get(j))
                    index[cin++]=j;
            }
        }
        for (int i = 0; i <n ; i++) {
            sum_sum+=A.get(index[i]);
        }
        out.println(sum_sum);

    }
}