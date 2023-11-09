package D1;

import java.util.Scanner;

public class DoubleDouble {
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int two = 1;
        System.out.print(two + " ");
        for(int i=0; i<a; i++){
            two *= 2;
            System.out.print(two + " ");
        }
    }
}
