package CodeForces;

import java.util.Scanner;
import java.io.PrintWriter;

public class ABoyOrGirl {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        String a = in.next();
        char ch[] = a.toCharArray();
        int arr[] = new int[101];
        for (int i = 0; i <a.length() ; i++) {
            arr[ch[i]-48]++;
        }
        int count=0;
        for(int x: arr){
            if(x>=1)count++;

        }
        if(count%2!=0){
            out.println("IGNORE HIM!");
            return;
        }
        out.println("CHAT WITH HER!");
    }
}
