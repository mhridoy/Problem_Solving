package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class ExamA {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();
        int a [] = new int[n];
        int b [] = new int[m];
        for (int i = 0; i <n ; i++) {
            a[i]=in.nextInt();

        }
        for (int i = 0; i <m ; i++) {
            b[i]= in.nextInt();
        }
        int max=0;
        int count=0;
        for (int i = 0; i <m ; i++) {

            for (int j = 0; j <n ; j++) {
                if(a[j]+b[i]%2!=0){
                    count++;
                    //if(count>max)max=count;
                    break;
                }

            }
        }
        out.print(count);
    }
}
