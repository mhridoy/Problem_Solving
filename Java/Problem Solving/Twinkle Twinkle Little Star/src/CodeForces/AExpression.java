package CodeForces;

import java.util.Scanner;
import java.io.PrintWriter;

public class AExpression {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int arr[]= new int[3];
        int max_1=0;
        int index_1=0;
        int max_2=0;
        int index_2=0;

        for (int i = 0; i <arr.length ; i++) {
            arr[i]= in.nextInt();
            if(max_1<arr[i]){
                max_1=arr[i];
                index_1=i;
            }
        }
        for (int i = 0; i <arr.length ; i++) {
            if(index_1!=i){
                if(max_2<arr[i]){

                }
            }
        }

    }
}
