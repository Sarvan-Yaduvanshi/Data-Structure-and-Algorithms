package Basic_Problem_In_Java;
import java.util.*;
public class TimeZone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter Year : ");
        int year = sc.nextInt();
        System.out.print("Please Enter a Month : ");
        int month = sc.nextInt();
        System.out.print("Please Enter a Day : ");
        int day = sc.nextInt();
        System.out.print("Please Enter a Hour : ");
        int hour = sc.nextInt();
        System.out.print("Please Enter a Minutes : ");
        int minutes = sc.nextInt();
        // GMT ---> IST
        hour += 5;
        minutes += 30;
        if ( minutes >= 60) {
            hour++;
            minutes -= 60;
        }
        if ( hour >= 24) {
            day++;
            hour -= 24;
        }
        if (month >= 12) {
            year++;
            month -= 12;
        }
        System.out.println("Year : " + year + ", Month : " + month +", Day : " + day + ", Hour : " + hour + ", Minutes : " + minutes);
    }
}

