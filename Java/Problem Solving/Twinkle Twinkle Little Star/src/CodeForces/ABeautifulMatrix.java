package CodeForces;

import java.util.Scanner;
import java.io.PrintWriter;

public class ABeautifulMatrix {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int array [][] = new int[6][6];
        int row =0,col=0;
        for (int i = 1; i <6 ; i++) {
            for (int j = 1; j <6 ; j++) {
                array[i][j]= in.nextInt();
                if(array[i][j]==1){
                    row =i;
                    col=j;
                }
            }
        }
        out.println(Math.abs(3-row)+Math.abs(3-col));

    }
}
