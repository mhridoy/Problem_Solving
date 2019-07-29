package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class BGameWithTelephoneNumbers {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
    int n = in.nextInt();
        String a = in.nextLine();
        int count=0;
        int bount =0;
        for (int i = 0; i <n-10 ; i++) {
            if(a.charAt(i)=='8')count++;
            else bount++;
        }
        if(count>=bount)out.println("YES");
        else out.println("NO");
    }
}
