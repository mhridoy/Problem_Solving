package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class BSuperSale {

    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int test = in.nextInt();
        while (test--!=0) {

            int objects = in.nextInt();
            int price[] = input(objects, in);
            int weights[] = input(objects, in);
            int people = in.nextInt();
            int group[] = input(people, in);
            int sum = 0;
            for (int i = 0; i < people; i++) {
                int max =knapSack(group[i], weights, price, objects);
               sum+=max;
                out.println(max);

            }
           // out.println(sum);
        }

    }
    static int knapSack(int W, int[] wt, int[] val, int n)
    {
        int i, w;
        int K [][] = new int[n+1][W+1];
        for (i = 0; i <= n; i++)
        {
            for (w = 0; w <= W; w++)
            {
                if (i==0 || w==0)
                    K[i][w] = 0;
                else if (wt[i-1] <= w)
                    K[i][w] = Math.max(val[i-1] + K[i-1][w-wt[i-1]],  K[i-1][w]);
                else
                    K[i][w] = K[i-1][w];
            }
        }

        return K[n][W];
    }

    private int[] input(int objects, InputReader in) {
        int array []= new int[objects];
        for (int i = 0; i <objects ; i++) {
            array[i]= in.nextInt();
        }
        return array;
    }
}
