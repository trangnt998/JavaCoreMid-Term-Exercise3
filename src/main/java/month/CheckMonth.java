package month;

import java.util.Scanner;

public class CheckMonth {
    /*
    Viết chương trình nhập vào một số nguyên không âm (n >= 0),
    kiểm tra số đó có là một tháng trong năm không.
    Nếu có thì in ra tháng đó có bao nhiêu ngày.
     */
    public static int inputNonNegativeNumber() { // nhập số >= 0
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Số cần nhập phải là số nguyên không âm!");
        }
        return n;
    }

    public static boolean isMonthOfYear(int n) { //true nếu n là 1 tháng trong năm
        return n > 0 && n <= 12;
    }

    public static int getTotalDaysOfMonth(int month) { //đưa ra số ngày của tháng
        int dayOfMonth = -1;

        if (isMonthOfYear(month)) {
            if (month == 2) {
                dayOfMonth = 28;
            }
            if (month == 4 || month == 6 || month == 9 || month == 11) {
                dayOfMonth = 30;
            }
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                dayOfMonth = 31;
            }
        }
        else {
            System.out.println("Tháng không hợp lệ!");
            return dayOfMonth;
        }
        return dayOfMonth;

    }

}


