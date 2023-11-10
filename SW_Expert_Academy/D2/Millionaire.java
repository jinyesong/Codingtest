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
        	
        	int max = intPriceArr[N-1]; //������ ���� max�� �����ؼ� �� ���ҵ�� �� 
        	int profit = 0;
        	for(int i=N-2; i>=0; i--) {
        		if(max>intPriceArr[i]) { //���� max���� �� Ŭ ��
        			profit += max-intPriceArr[i];
        		}
        		else { //���� max������ i��° ���� Ŭ ��
        			max = intPriceArr[i];
        		}
        	}
        	System.out.println("#"+test_case+" "+profit);
        }
    }
}
