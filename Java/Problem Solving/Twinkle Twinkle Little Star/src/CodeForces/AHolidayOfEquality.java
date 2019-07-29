package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class AHolidayOfEquality {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
    int citizen = in.nextInt();
    int array [] = new int[citizen];
    int max = 0;
        for (int i = 0; i <citizen ; i++) {
            array[i]= in.nextInt();
            if(array[i]>max)max=array[i];
        }
        int sum=0;
        for (int i = 0; i <citizen ; i++) {
            //if(array[i]!=max)
                sum+=max-array[i];
        }
        out.println(sum);
    }

}
