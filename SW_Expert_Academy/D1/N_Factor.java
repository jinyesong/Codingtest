package D1;

import java.util.Scanner;

public class N_Factor {
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for(int i=1; i<=a; i++){
            if(a%i == 0){
                System.out.print(i + " ");
            }
        }
    }
}
