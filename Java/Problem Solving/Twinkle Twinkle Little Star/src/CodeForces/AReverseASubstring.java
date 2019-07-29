package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class AReverseASubstring {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int n=in.nextInt();
        char[]s=in.nextLine().toCharArray();
        int index=-1;
        for(int i=0;i<n-1;i++)
            if(s[i]>s[i+1])
                index=i;
        if(index==-1)
            out.println("NO");
        else
            out.println("YES\n"+(index+1)+" "+(index+2));
    }
}
