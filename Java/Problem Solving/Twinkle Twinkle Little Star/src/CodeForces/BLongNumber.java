package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class BLongNumber {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
    int n = in.nextInt();
    char  x[] = in.next().toCharArray();
    //String x = in.next();
        getReadyForAC(n,x,in,out);

    }

    private void getReadyForAC(int n, char[] x, InputReader in, PrintWriter out) {
      String temp="";
        int arr[] = new int[10];
        for (int i = 0; i <9 ; i++) {
            arr[i+1]= in.nextInt();
        }
        for (int i = 0; i <n ; i++) {
            if(x[i]-'0'<arr[x[i]-'0']){
                int index=i;
                while (x[index]-'0'
                        <=arr[x[index]-'0']&& index<n)
                    x[index]= (char) ('0'+arr[x[index]-'0']);
                    index++;
            }
            break;
        }
        for (int i = 0; i <x.length ; i++) {
          out.print(x[i]);
        }


        //        Map<Integer, Integer> haha = new HashMap<>();
//        for (int i = 1; i <=9 ; i++) {
//            int j = in.nextInt();
//            haha.put(i,j);
//        }
//        for (int i = 0; i <n ; i++) {
//            int h = x[i]-'0';
//            char a = (char) (haha.get(h)+'0');
//            if(haha.get(h)>h)x[i]=a;
//        }
//        for (int i = 0; i <x.length ; i++) {
//            out.print(x[i]);
//        }

    }
}
