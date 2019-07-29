package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class BMikeAndChildren {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int sweet = in.nextInt();
        int array[] = new int[sweet];
        for (int i = 0; i < sweet; i++) {
            array[i] = in.nextInt();
        }
        Arrays.sort(array);
        int crray[] = new int[sweet * sweet];
        int count = 0;
        int index = 0;
        int max=0;
        for (int i = 0; i < sweet ; i++) {
            for (int j = 0; j < sweet ; j++) {//9 8 7 6 11
                if (array[i] != array[j] && i != j)
                {
                    crray[++index] = array[i] + array[j];
                    if(max<crray[index]) max= crray[index];
                }
            }

        }
        int d [] = new int[max*10];
        for (int i = 0; i <crray.length ; i++) {
            //out.println(crray[i]);
            if(crray[i]!=0)
            d[crray[i]]++;
        }
        max=0;
        for(int x : d)
        {
            if(max<x)max=x;
        }
        if(max%2==0)
        out.println(max/2);
        else
            out.println((max/2)+1);

    }

}
