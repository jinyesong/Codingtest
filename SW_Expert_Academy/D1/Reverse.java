package D1;

import java.util.Scanner;

public class Reverse {
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for(int i=a; i>=0; i--){
            System.out.print(i + " ");
        }
    }
}
