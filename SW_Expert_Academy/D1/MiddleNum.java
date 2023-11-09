package D1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MiddleNum {
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i<T; i++){
            arr.add(sc.nextInt());
        }
        Collections.sort(arr);
        arr.get(T/2);
    }
}