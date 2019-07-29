package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class BDoubleMatrix {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int  n=in.nextInt() , m=in.nextInt();
        int a[][]= new int[n][m] , b[][]= new int[n][m] ;
        for(int i = 0 ; i < n; ++i){
            for(int j = 0 ; j < m; ++j){
                 a[i][j]=in.nextInt();
            }
        }
        for(int i = 0 ; i < n; ++i){
            for(int j = 0 ; j < m; ++j){
                 b[i][j]=in.nextInt();
            }
        }
        for(int i = 0 ; i < n-1; ++i){
            for(int j = 0 ; j < m-1; ++j){
                if(a[i][j] >= a[i][j+1] && b[i][j] >= a[i][j+1]){
                     out.println("Impossible");
                     return;
                }
                if(a[i][j] >= a[i+1][j] && b[i][j] >= a[i+1][j]){
                    out.println("Impossible");
                    return;
                }
                if(b[i][j] >= b[i][j+1] && a[i][j] >= b[i][j+1]){
                    out.println("Impossible");
                    return;
                }
                if(b[i][j] >= b[i+1][j] && a[i][j] >= b[i+1][j]){
                    out.println("Impossible");
                    return;
                }
            }
        }
        out.println("Possible");
    }
}
