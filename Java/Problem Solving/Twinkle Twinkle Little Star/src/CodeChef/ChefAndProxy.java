package CodeChef;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class ChefAndProxy {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
    int test = in.nextInt();
    while (test--!=0){
        int totalclass = in.nextInt();
        String presents = in.next();
        int count=0;
        for (int i = 0; i <presents.length() ; i++) {
            if(presents.charAt(i)=='P')count++;
        }
        out.println(Calculate(presents,totalclass,count));
    }
    }
    static int Calculate(String str, int totalAttendance, int totalPresent){
        int totalDays = totalAttendance;
        int required = totalDays*75;
        totalPresent = totalPresent*100;
        if(required <= totalPresent) return 0;
        else if(totalDays<5) return -1;
        int proxy = 0;
        for(int i=2;i<totalDays-2;i++){
            if(str.charAt(i)=='A' &&
                    (str.charAt(i-1) =='P' || str.charAt(i-2)=='P') && (str.charAt(i+1) =='P' || str.charAt(i+2)=='P')){
                proxy++;
            }
            if(proxy*100+totalPresent>=required) return proxy;
        }

        return -1;
    }
}
