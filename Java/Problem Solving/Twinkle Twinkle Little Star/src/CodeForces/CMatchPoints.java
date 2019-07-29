package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class CMatchPoints {
    int save[]= new int[1000009];
    public void settings (int save[]) {
        for (int i = 0; i <save.length ; i++) {
            save[i]=Integer.MAX_VALUE;
        }
    }
    public void solve(int testNumber, InputReader in, PrintWriter out) {

            int a=in.nextInt();
            int b=in.nextInt();
            int index=0,win=0;

            for(int i=0;i<a;i++)
            {
                save[i]=in.nextInt();
            }
            Arrays.sort(save);
            index=a/2;
            if(a%2==1) index++;
            for(int i=0;i<a;i++) {
                while (index <= a && (save[index] - save[i] < b))
                    index++;
                if (index < a)
                    win++;
                index++;
            }
            out.println(win);
    }
}
