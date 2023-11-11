package D2;

import java.util.Scanner;

public class PatternLength {
	public static void main(String args[]) throws Exception {
        //같은 문자가 나올 때를 기준으로 자름
		//잘랐을 때 1번째 잘린 조각과 2번째 잘린 조각이 같으면 해당 조각 갯수 출력
		//다르면 같은 문자가 두번째 나올때를 기준으로 자름 -> 3번째,4번째,,
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		sc.nextLine();
		for(int test_case = 1; test_case <= T; test_case++)
		{
			String input = sc.nextLine();
			char input_first = input.charAt(0);
			for(int i=1; i<input.length(); i++) {
				if(input_first == input.charAt(i)) {
					String sub1 = input.substring(0, i);
					String sub2 = input.substring(i, i + sub1.length());
					if(sub1.equals(sub2)) {
						System.out.println("#"+test_case+" "+sub1.length());
						break;
					}
					else {
						continue;
					}
				}
				
			}
		}
    }
}
