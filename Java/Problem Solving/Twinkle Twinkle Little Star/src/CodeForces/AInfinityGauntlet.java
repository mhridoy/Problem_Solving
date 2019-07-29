package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class AInfinityGauntlet {

    public void solve(int testNumber, InputReader in, PrintWriter out) {
        String colors [] = {"purple","green","blue","orange","red","yellow"};
        String power[] ={"Power","Time","Space","Soul","Reality","Mind"};

        int n = in.nextInt();
        String input [] = new String[n];
        for(int i =0; i<n;i++)input[i]=in.next();
        int save [] = new int[6];
        Arrays.fill(save,7);
        int index=0;
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <colors.length ; j++) {
                //if(i!=j)
                    if(input[i].equals(colors[j]))
                    {
                        save[index]=j;
                        break;
                    }
            }
            ++index;
        }
       // for(int x : save)out.print(x);
        out.println(6-n);
        for (int i = 0; i <6 ; i++) {
            if(check(i,save))
                out.println(power[i]);
        }
    }
    static  boolean check(int x, int[] save)
    {
        for(int i =0;i<6;i++)if(x==save[i])return false;
        return true;
    }
}
