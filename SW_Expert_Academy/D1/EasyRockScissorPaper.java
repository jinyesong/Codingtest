package D1;

import java.util.Scanner;

public class EasyRockScissorPaper {
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a == 1 && b == 3){
            System.out.println("A");
        }
        else{
            if(a>b){
                System.out.println("A");
            }
            else{
                System.out.println("B");
            }
        }
    }
}
