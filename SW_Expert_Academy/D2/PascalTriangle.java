package D2;

import java.util.Scanner;

public class PascalTriangle {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++){
			int input = sc.nextInt();
			int[][] pascalTriangle = new int[input][];
			
			for(int i=0; i<input; i++) {
				int[] newArr = new int[i+1];
				if(i<=1) {
					for(int j=0; j<i+1; j++) {
						newArr[j] = 1;
					}
				}
				else { //i°¡ 1ÀÌ»ó
					newArr[0] = 1;
					int[] prevArr = pascalTriangle[i-1];
					for(int j=1; j<i; j++) {
						newArr[j] = prevArr[j-1] + prevArr[j];
					}
					newArr[i] = 1;
				}
				pascalTriangle[i] = newArr;
			}
			
			System.out.println("#"+test_case);
			for(int i=0; i<input; i++) {
				for(int j=0; j<i+1; j++) {
					System.out.print(pascalTriangle[i][j] + " ");
				}
				System.out.println();
			}	
		}
    }
}
