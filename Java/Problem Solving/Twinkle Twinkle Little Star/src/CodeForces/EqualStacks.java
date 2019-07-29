package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Queue;

public class EqualStacks {
    public void solve(int testNumber, InputReader in, PrintWriter out) {

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        Queue<Integer> stack1 = new LinkedList<>();
        Queue<Integer> stack2 = new LinkedList<>();
        Queue<Integer> stack3 = new LinkedList<>();
        int total1 = 0;
        int total2 = 0;
        int total3 = 0;

        for(int i = 0;i<a;i++){
            int value = in.nextInt();
            stack1.add(value);
            total1+=value;
        }

        for(int i = 0;i<b;i++){
            int value = in.nextInt();
            stack2.add(value);
            total2+=value;
        }

        for(int i = 0;i<c;i++){
            int value = in.nextInt();
            stack3.add(value);
            total3+=value;
        }

        while(!((total1==total2)&&(total2==total3)&&(total1==total3))){
            if(total1>=total2 && total1>=total3){
                total1 -=stack1.remove();
            }else if(total2 >=total1 && total2>=total3){
                total2 -=stack2.remove();
            }else{
                total3 -=stack3.remove();
            }
        }
      out.println(total1);}
}
