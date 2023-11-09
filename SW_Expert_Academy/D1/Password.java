package D1;

import java.util.Scanner;

public class Password {
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int p = sc.nextInt();
        System.out.println(k-p+1);
    }
}
