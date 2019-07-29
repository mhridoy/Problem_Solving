package Assiut_University_Training_Newcomers;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class IHussienAndArray {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int n = in.nextInt();
        int arrray[]= new int[n];
        int low = Integer.MAX_VALUE;
        for (int i = 0; i <n ; i++) {
            arrray[i] = in.nextInt();
            if(arrray[i]<low) low = arrray[i];
        }
       // out.println(low);
        int odd_counter =0;
        for(int x : arrray)
            if(x==low)
                odd_counter++;

        if(odd_counter%2==0)
            out.println("Unlucky");
        else
            out.println("Lucky");
    }
}
