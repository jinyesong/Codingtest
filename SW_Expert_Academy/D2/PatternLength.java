package D2;

import java.util.Scanner;

public class PatternLength {
	public static void main(String args[]) throws Exception {
        //���� ���ڰ� ���� ���� �������� �ڸ�
		//�߶��� �� 1��° �߸� ������ 2��° �߸� ������ ������ �ش� ���� ���� ���
		//�ٸ��� ���� ���ڰ� �ι�° ���ö��� �������� �ڸ� -> 3��°,4��°,,
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
