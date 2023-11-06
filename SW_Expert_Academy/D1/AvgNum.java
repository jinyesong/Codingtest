package D1;
import java.util.Scanner;

public class AvgNum {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
        sc.nextLine();

        for(int test_case = 1; test_case <= T; test_case++) {
            String[] inputArr = sc.nextLine().split(" ");

            double avg = 0;
            for(int i=0; i<inputArr.length; i++){
                avg += Integer.parseInt(inputArr[i]);
            }
            System.out.println("#" + test_case + " " + Math.round(avg / inputArr.length));
        }
    }
}
