package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class BParityAlternatedDeletions {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
    int test = in.nextInt();
    int[] array = new int[test];
    int initial = array[0];
        boolean previous = check(initial);

        array[0]=0;//1 2 3
        for (int i = 1; i <test ; i++) {
            boolean current = check(array[i]);
            if(previous!=current) {
                boolean check = playgame(array, previous, i);
                previous =check(array[i]);
                if (check)
                    continue;
                else
                    break;
            }

        }
        int sum=0;
        for(int x : array)sum+=x;
        out.println(sum);



    }

    public boolean playgame(int[] array, boolean previous, int search) {

        for (int i = search; i <array.length ; i++) {
            if(previous){
                if(array[i]%2==0)
                {
                    array[i]=0;
                    return true;
                }

            }
            else {
                if(array[i]%2!=0){
                    array[i]=0;
                    return true;
                }
            }
        }
        return false;

    }

    public boolean check(int previous) {
        if(previous%2==0)
            return true;

            return false;
    }

}
