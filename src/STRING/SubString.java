package STRING;
import java.util.*;
public class SubString {
//    public static String calculateSubString(String str, int si, int ei) {
//        String substr = "";
//        for ( int i = si; i < ei; i++) {
//            substr += str.charAt(i);
//        }
//        return substr;
//    }
    public static void main(String[] aRGS) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter a String : ");
        String str = sc.nextLine();
//        System.out.println(calculateSubString(str,0,4));
        // InBuild Function
        System.out.println(str.substring(0, 4));

    }
}
