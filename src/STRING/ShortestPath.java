/*
  Q1 Given a route containing 4 directions (E,W,N,S), Find the shortest path to reach destination.
  Example: Input:
          "WNEENESENNN"     North ----> y + 1,   South ----> y - 1
           Output :         West  ----> x  - 1,  East  ----> x - 1
           10.0
 */
package STRING;
import java.util.*;
public class ShortestPath {
    public static float getShortestPath(String path) {
        int x = 0, y = 0;
        for ( int i = 0; i < path.length(); i++) {
            int dir = path.charAt(i);
            // South
            if (dir == 'S') {
                y--;
            } else if (dir == 'N') {  // North
                y++;
            } else if (dir == 'W') {  // West
                x--;
            } else {   // East
                x++;
            }
        }
        int x2 = x*x, y2 = y*y;
        return (float)Math.sqrt(x2 + y2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter a String : ");
        String path = sc.nextLine();
        float result = getShortestPath(path);
        System.out.println("Your Shortest Distance is : " + result);
    }
}

//            <=========>  Time Complexity o(n)    <==========>
