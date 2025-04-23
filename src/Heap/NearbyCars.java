package Heap;
import java.util.*;
public class NearbyCars {
    static class Point implements Comparable<Point> {
        int x;
        int y;
        int distSq;
        int idx;

        public Point(int x, int y, int distSq, int idx) {
            this.x = x;
            this.y = y;
            this.distSq = distSq;
            this.idx = idx;
        }

        @Override
        public int compareTo(Point p2) {
            return this.distSq - p2.distSq;
        }
    }

    public static void main(String[] args) {
        int[][] point = {{3, 3}, {5, -1}, {-2, 4}};
        int k = 2;

        PriorityQueue<Point> queue = new PriorityQueue<>();
        for (int i = 0; i < point.length; i++) {
            int distSq = point[i][0] * point[i][0] + point[i][1] * point[i][1];
            queue.add(new Point(point[i][0], point[i][1], distSq, i));
        }

        // nearest K cars
        for (int i = 0; i < k; i++) {
            System.out.println("C" + queue.remove().idx);
        }
    }
}
