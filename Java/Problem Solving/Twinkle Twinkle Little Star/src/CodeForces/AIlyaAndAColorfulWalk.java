package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class AIlyaAndAColorfulWalk {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int test = in.nextInt();
        int max=0;
        int min=Integer.MAX_VALUE;
        int index_max=0,index_min=0;
        int max_a=0,min_a=Integer.MAX_VALUE;
        int a[] = new int[test+1];
        List<Integer> array = new ArrayList<>();
        List<Integer> crray = new ArrayList<>();
        for (int i = 1; i <=test ; i++) {
            a[i]= in.nextInt();
            int x = a[i];
            if(x>=max){
                max=x;


            }
            if(x<=min)
            {
                min=x;
            }
        }
        for(int x=1;x<=test;x++)
        {
            if(a[x]==max)array.add(x);
            if(a[x]==min)crray.add(x);
        }
        for (int i = 0; i <Math.max(array.size(),crray.size()) ; i++) {
            for (int j = 0; j <Math.min(array.size(),crray.size()) ; j++) {
                if(array.size()>crray.size())
                {
                    int dis = Math.abs(array.get(i)-crray.get(j));
                    if(max_a<dis)max_a=dis;
                }
                else
                {
                    int dis = Math.abs(array.get(j)-crray.get(i));
                    if(max_a<dis)max_a=dis;
                }
            }
        }

        out.println(Math.abs(max_a));
    }
}
