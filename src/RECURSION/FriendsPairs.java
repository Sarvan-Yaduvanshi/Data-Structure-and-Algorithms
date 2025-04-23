package RECURSION;
import java.util.*;
public class FriendsPairs {
    public static int friendsPairs(int n) {
        // Base Case
        if (n == 1 || n == 2) {
            return n;
        }
        return friendsPairs(n - 1) + friendsPairs(n - 1) * friendsPairs(n - 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a friend's number : ");
        int num = sc.nextInt();
        System.out.println("Total pairs ways possible : " + friendsPairs(num));
    }
}
