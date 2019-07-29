package CodeForces;

import java.util.Scanner;
import java.io.PrintWriter;

public class BPlusFromPicture {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
    int h = in.nextInt();
    int w = in.nextInt();
        char grid[][] = new char[h][w]; // 2D char array
        int count=0;
        for (int i = 0; i < h; i++) {
            String data = "";
            if (in.hasNext()) { // input from user
                data = in.next();
            } else {
                break;
            }
            for (int j = 0; j < w; j++) {
                grid[i][j] = data.charAt(j);
                if(grid[i][j]=='*')count++;
            }
        }
        int flag = 0;
        for(int i = 1 ; i<h-1; i++){
            for(int j = 1 ; j<w-1; j++){
                int c = 1;
                int a1 = 0;
                int a2 = 0;
                int a3 = 0;
                int a4 = 0;
                if(grid[i][j]=='*'){
                    for(int k = j+1 ; k<w ; k++){
                        //i
                        if(grid[i][k]=='*'){
                            c++;
                            a1 = 1;

                        }
                        else
                            break;
                    }

                    if(a1==0)
                        continue;
                    for(int k = j-1 ; k>=0 ; k--){
                        //i 
                        if(grid[i][k]=='*'){
                            c++;
                            a2 =1;
                        }

                        else
                            break;
                    }

                    if(a2==0)
                        continue;

                    for(int k = i+1 ; k<h ; k++){
                        //j
                        if(grid[k][j]=='*'){
                            a3 = 1;
                            c++;
                        }

                        else
                            break;
                    }
                    if(a3==0)
                        continue;

                    for(int k = i-1 ; k>=0 ; k--){
                        //j 
                        if(grid[k][j]=='*'){
                            c++;
                            a4=1;
                        }

                        else
                            break;
                    }

                    if(a4==0)
                        continue;

                }

                if(c>=5){
                    if(c==count){
                        flag = 1;
                        break;
                    }
                }


            }
            if(flag==1)
                break;
        }

        if(flag==1)
            out.println("YES");
        else
            out.println("NO");
    }
}
