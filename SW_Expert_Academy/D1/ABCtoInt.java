package D1;

import java.util.Scanner;

public class ABCtoInt {
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char[] charInput = input.toCharArray();
        for(char a : charInput){
            System.out.print(((int)a-64) + " ");
        }
    }
}

