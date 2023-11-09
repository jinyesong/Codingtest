package D1;
import java.util.Scanner;

public class MaxNum {
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
        sc.nextLine();
        for(int test_case = 1; test_case <= T; test_case++)
        {
            String[] input = sc.nextLine().split(" ");
            int max = 0;
            for(String num : input){
                if(max < Integer.parseInt(num)){
                    max = Integer.parseInt(num);
                }
            }
            System.out.println("#" + test_case + " " + max);
        }
    }
}
