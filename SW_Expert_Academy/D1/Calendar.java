package D1;

import java.util.Scanner;

public class Calendar {
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
        sc.nextLine();
        for(int test_case = 1; test_case <= T; test_case++)
        {
            String input = sc.nextLine();
            int year = Integer.parseInt(input.substring(0, 4));

            int month = Integer.parseInt(input.substring(4, 6));
            int date = Integer.parseInt(input.substring(6));

            if(1 > month || month > 12){
                System.out.println("#" + test_case + " -1");
                continue;
            }
            if(month == 2){
                if( 0 > date || date > 28){
                    System.out.println("#" + test_case + " -1");
                    continue;
                }
            }
            if( month == 1 ||  month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
                if( 0 > date || date > 31){
                    System.out.println("#" + test_case + " -1");
                    continue;
                }
            }
            if(month == 4 ||  month == 6 || month == 9 || month == 11){
                if( 0 > date || date > 30){
                    System.out.println("#" + test_case + " -1");
                    continue;
                }
            }
            String strYear = Integer.toString(year);
            String strMonth = Integer.toString(month);
            String strDate = Integer.toString(date);
            if(strYear.length() < 4){
                String zero = "";
                for(int i=0; i<4 - strYear.length(); i++){
                    zero += "0";
                }
                strYear = zero + strYear;
            }
            if(strMonth.length() < 2){
                strMonth = "0" + month;
            }
            if(strDate.length() < 2){
                strDate = "0" + date;
            }
            System.out.println("#" + test_case + " " + strYear + "/" + strMonth + "/" + strDate);
        }
    }
}
