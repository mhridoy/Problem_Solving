package CodeForces;

import java.util.Scanner;
import java.io.PrintWriter;
//egg price 108Taka :P
public class BEmailFromPolycarp {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
    int test = in.nextInt();
    while (test--!=0){
        int i=0,count=0,flag=0;
        String s =in.next(),s1= in.next();
        if(s1.charAt(0)!=s.charAt(0)){
            out.println("NO");
            continue;
        }
        for ( i = 0; i <s1.length() ; i++) {
            if(s1.charAt(i)==s.charAt(count))count++;
            else if(s1.charAt(i)!=s1.charAt(i-1))flag=1;
            if(count==s.length())break;
        }
        while(i!=s1.length())
        {
            if(s1.charAt(i)!=s.charAt(s.length()-1))
                flag=1;
            i++;
        }
        if(count==s.length()&&flag==0)
            out.println("YES");
        else
        {
            out.println("NO");
        }
    }
    }
}
