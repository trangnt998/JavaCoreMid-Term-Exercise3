package month;

import static month.CheckMonth.getTotalDaysOfMonth;
import static month.CheckMonth.inputNonNegativeNumber;

public class App {
    public static void main(String[] args) {
        System.out.print("Nhập số không âm n: ");
        int n = inputNonNegativeNumber();
        int dayOfMonth = getTotalDaysOfMonth(n);
        if(dayOfMonth > 0) {
            System.out.println("Tháng " + n + " có: " + dayOfMonth + " ngày");
        }
    }
}
