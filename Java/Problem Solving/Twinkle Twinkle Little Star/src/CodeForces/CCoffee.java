package CodeForces;

import Fast_IO.InputReader;
import java.io.PrintWriter;

public class CCoffee {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        while (in.hasNext()) {
            int test = Integer.parseInt(in.next());
            while (test-- != 0) {
                int types_of_coffes = Integer.parseInt(in.next());
                int persons = Integer.parseInt(in.next());
                int delivery_fees = 100 / persons;
                String coffes[] = input(in, types_of_coffes);
                String person[] = input(in, persons);
                for (int i = 0; i < persons; i++) {
                    String a[] = person[i].split(" ");
                    //out.println(a[0]);
                    for (int j = 0; j < types_of_coffes; j++) {
                        String b[] = coffes[j].split(" ");
                        //out.println(b[0]);
                        if (a[2].equals(b[0])) {
                            if (a[1].equals("small")) {
                                int sum = Integer.parseInt(b[1]) + delivery_fees;
                                if ((sum - 1) % 5 == 0) {
                                    out.println(a[0] + " " + (sum - 1));
                                    break;
                                } else if ((sum + 1) % 5 == 0) {
                                    out.println(a[0] + " " + (sum + 1));
                                    break;
                                } else {
                                    out.println(a[0] + " " + (sum));
                                    break;
                                }
                            } else if (a[1].equals("medium")) {
                                int sum = Integer.parseInt(b[2]) + delivery_fees;
                                if ((sum - 1) % 5 == 0) {
                                    out.println(a[0] + " " + (sum - 1));
                                    break;
                                } else if ((sum + 1) % 5 == 0) {
                                    out.println(a[0] + " " + (sum + 1));
                                    break;
                                } else
                                {
                                    out.println(a[0] + " " + (sum));
                                    break;
                                }
                            } else if (a[1].equals("large")) {
                                int sum = Integer.parseInt(b[3]) + delivery_fees;
                                if ((sum - 1) % 5 == 0) {
                                    out.println(a[0] + " " + (sum - 1));
                                    break;
                                } else if ((sum + 1) % 5 == 0) {
                                    out.println(a[0] + " " + (sum + 1));
                                    break;
                                } else
                                {
                                    out.println(a[0] + " " + (sum));
                                    break;
                                }
                            }
                        }
                    }
                }

            }
        }
    }

    private String[] input(InputReader in, int types_of_coffes) {
        String a [] = new String[types_of_coffes];
        for (int i = 0; i < types_of_coffes; i++) {
            a[i]= in.nextLine();
        }
        return a;
    }
}
