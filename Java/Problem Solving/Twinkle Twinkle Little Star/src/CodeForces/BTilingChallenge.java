package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class BTilingChallenge {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
    int n  = in.nextInt();
    //in.nextLine();
    char a[][] = new char[n+3][n+3];
    String b [] = new String[n+1];
        for (int i = 0; i <n ; i++) {
           b[i]= in.next();

        }
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                a[i][j]=b[i].charAt(j);
            }
        }
        for (int i = 1; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                if(a[i][j]=='.')
                {
                    if(a[i-1][j]=='.' && a[i+1][j]=='.' && a[i][j+1]=='.' && a[i][j-1]=='.')
                    {
                        a[i-1][j]='#';
                        a[i+1][j]='#';
                        a[i][j+1]='#';
                        a[i][j-1]='#';
                    }
                }
            }
        }
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                if(a[i][j]=='.'){
                    out.println("NO");
                    return;
                }
            }
        }
        out.println("YES");
    }
}
