package D2;

import java.util.Scanner;

public class Easy369 {
	public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        for (int i = 1; i <= N; i++) {
        	String str = Integer.toString(i);
        	if( str.length() > 1) { //2ÀÚ¸´¼ö ÀÌ»ó
        		int count = 0;
        		for(int j = 0; j<str.length(); j++) {
        			if(str.charAt(j) == '3' || str.charAt(j) == '6' || str.charAt(j) == '9'){
        				count ++;
        			}
        		}
        		if(count == 0) {
        			System.out.print(str+" ");
        		}
        		else if(count > 0) {
        			for(int k=0; k<count; k++) {
            			System.out.print("-");
        			}
        			System.out.print(" ");
        		}
        	}
        	else { //1ÀÚ¸´¼ö
        		if(i == 3 || i == 6 || i == 9) {
        			System.out.print("- ");
        		}
        		else {
        			System.out.print(str+" ");
        		}
        	}
        }
    }
}
