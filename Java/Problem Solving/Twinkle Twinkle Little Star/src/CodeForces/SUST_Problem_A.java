package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class SUST_Problem_A {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int test = in.nextInt();
        int index=0;
        while (test--!=0){
            String line = in.nextLine();
            //String temp[] = line.split("\\W");
            String temp[] = line.split("[ ,.]");
            String save[]= new String[200];
            int ind=0;
            for (String a : temp) {
                if(a.length()==3){
                   //out.println(a);
                    save[ind++]=a;
                }
            }
            int cse=0,eee=0,swe=0,other=0;
            for (int i = 0; i <ind ; i++) {
                if(save[i].equals("CSE"))
                    cse++;
                else if(save[i].equals("EEE"))
                    eee++;
                else if(save[i].equals("SWE"))
                    swe++;
                else if(save[i].toUpperCase().equals(save[i]))
                    other++;
            }
            if(cse>=1 && eee==0 && swe==0 && other==0)
                out.println(String.format("Case %d: SUST CSE Carnival",++index));
            else if(cse>=1 && eee>=1 && swe>=1 && other>=0)
                out.println(String.format("Case %d: SUST Tech Fest",++index));
            else{
                out.println(String.format("Case %d: Festival of SUST",++index));
            }
        }
    }
}
