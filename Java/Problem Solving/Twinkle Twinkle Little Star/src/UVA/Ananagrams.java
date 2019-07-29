package UVA;

import Fast_IO.InputReader;
import java.io.PrintWriter;
import java.util.*;

public class Ananagrams {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        ArrayList <String > store1 = new ArrayList<>();
        ArrayList <String > store2 = new ArrayList<>();
        while(in.hasNext())
        {
            String line = in.next();
            if(line.equals("#")) break;
            store2.add(line);
            String temp=sortString(line).toLowerCase();

            store1.add(temp);

        }
        Collections.sort(store1);
        List<String> output = new LinkedList<>();
        for(String s : store2)
        {
            //out.println("Input String s :"+s);
            if(!containsName(s,store1)){
                output.add(s);
              //  out.println("Output "+s);
            }
        }
        Collections.sort(output);
        for(String s: output)
            out.println(s);

        //out.println("-------------Input-------------------");
        //for(String s : store2)out.println(s);
    }

    private boolean containsName(String s, ArrayList<String> store1) {
        String temp = sortString(s).toLowerCase();
        //System.out.println("Contains Name Temp :"+temp);
        int count=0;
        for (int i = 0; i <store1.size() ; i++) {
            if(temp.equals(store1.get(i)))
            {

                //System.out.println("Store 1 : "+store1.get(i));
                count++;
                //return true;

            }
        }
        if(count==1)
        return false;
        else
            return true;

    }

    public static String sortString(String inputString)
    {
               char tempArray[] = inputString.toCharArray();


        Arrays.sort(tempArray);

               return new String(tempArray);
    }
}
