package D1;

import java.util.Scanner;

public class DigitSum {
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        String[] T = sc.next().split("");
        int sum = 0;
        for(int i=0; i<T.length; i++){
            sum += Integer.parseInt(T[i]);
        }
        System.out.println(sum);
    }
}
