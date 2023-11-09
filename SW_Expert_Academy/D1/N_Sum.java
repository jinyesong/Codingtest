package D1;

import java.util.Scanner;

public class N_Sum {
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        int sum = 0;
        for(int i=1; i<=T; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
