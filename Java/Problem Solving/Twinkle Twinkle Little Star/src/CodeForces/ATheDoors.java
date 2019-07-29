package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class ATheDoors {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int test = in.nextInt();
        int array[] = new int[test];
        int left=0;
        int right=0;
        for (int i = 0; i < test; i++) {
            array[i] = in.nextInt();

        }
        int index=0;
        for (int i = 0; i <test ; i++) {
            if(array[i]==1)right++;
            else if(array[i]==0)left++;
            if((right>=1 && left>1)||(right>1 && left>=1))
            {
                index=i;
                break;
            }
        }
        out.println(index+1);
    }
}

