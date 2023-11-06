package D1;

import java.util.Scanner;

class OddNum {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();
        sc.nextLine();

        for(int test_case = 1; test_case <= T; test_case++) {
            String[] testArr = sc.nextLine().split(" ");

            int sum = 0;
            for(int i = 0; i<testArr.length; i++){
                int n = Integer.parseInt(testArr[i]);
                if((n%2) == 1){
                    sum += n;
                }
            }

            System.out.println("#" + test_case + " " + sum);
        }
    }
}