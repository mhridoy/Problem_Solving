package CodeForces;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class IIcecreamKnapsack {
    public static void main(String[] args) throws FileNotFoundException {
        //File  file = new File("D:\\JetBrains\\Twinkle Twinkle Little Star\\input\\looking.in.txt");
        File file = new File("looking.in");
        Scanner in = new Scanner(file);
        while (in.hasNext())
        {
            int test = Integer.parseInt(in.next());
            while (test-- !=0) {
                int n = Integer.parseInt(in.next());
                int k = Integer.parseInt(in.next());
                int sum=0;
                for (int i = 0; i <n ; i++) {
                    int x = Integer.parseInt(in.next());
                    sum|=x;
                }
                System.out.println(sum);
            }

        }
    }
}
