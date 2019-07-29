package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ADiverseStrings {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int test = in.nextInt();
        while(test-- !=0)
        {
            String s = in.nextLine();
            List<Integer>array = new ArrayList<>();
            for (int i = 0; i <s.length (); i++) {
                array.add((int)s.charAt(i));
            }


            Collections.sort(array);
            int start= array.get(0);
            int finish= array.get(array.size()-1);
            List<Integer> crray = new ArrayList<>();
            int index=0;
            for (int i =start; i <=finish ; i++) {
                crray.add(i);
            }
            boolean flag =false;
            int[] drray = new int[array.size()];
            int[] erray = new int[crray.size()];
            for(int i =0; i<drray.length;i++)
                drray[i]=array.get(i);
            for(int i =0; i<erray.length;i++)
                erray[i]=crray.get(i);

            if(Arrays.equals(drray,erray))out.println("Yes");
            else out.println("No");
        }
    }
}
