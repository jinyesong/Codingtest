package D2;

import java.util.Scanner;

public class Millionaire_Error {
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++)
        {
            int N = sc.nextInt();
            sc.nextLine();
            String[] strArr = sc.nextLine().split(" ");
            int[] arr = new int[strArr.length];
            for(int i = 0; i < strArr.length; i++){ //int 배열로 변환
                arr[i] = Integer.parseInt(strArr[i]);
            }

            int profit = 0; //이익
            boolean isMax = false; //오름차인지 판단
            int startIdx = 0; //시작 index 저장
            for(int i=1; i<N; i++){
                if(arr[i-1] < arr[i]){
                    if(i == N-1){ //마지막 날
                        for(int j=startIdx; j<i; j++){ //지금까지의 이익 더하기
                            profit += arr[i] - arr[j];
                        }
                    }
                    if(!isMax){ //오름차순 시작하는 부분
                        isMax = true;
                    }
                }
                else{
                    if(isMax){//오름차순 가다가 끊길 때
                        for(int j=startIdx; j<i-1; j++){ //지금까지의 이익 더하기
                            profit += arr[i-1] - arr[j];
                        }
                        isMax = false;
                        startIdx = i;
                    }
                }
            }
            System.out.println("#"+test_case+" "+profit);
        }
    }
}
