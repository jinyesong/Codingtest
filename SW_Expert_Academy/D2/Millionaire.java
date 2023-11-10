package D2;

import java.util.Scanner;

public class Millionaire {
	public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();
        sc.nextLine();
        for (int test_case = 1; test_case <= T; test_case++) {
        	int N = sc.nextInt();
        	int[] intPriceArr = new int[N];
        	for(int i=0; i<N; i++) { 
        		intPriceArr[i] = sc.nextInt();
        	}
        	
        	int max = intPriceArr[N-1]; //마지막 값을 max로 시작해서 앞 원소들과 비교 
        	int profit = 0;
        	for(int i=N-2; i>=0; i--) {
        		if(max>intPriceArr[i]) { //현재 max값이 더 클 때
        			profit += max-intPriceArr[i];
        		}
        		else { //현재 max값보다 i번째 값이 클 때
        			max = intPriceArr[i];
        		}
        	}
        	System.out.println("#"+test_case+" "+profit);
        }
    }
}
