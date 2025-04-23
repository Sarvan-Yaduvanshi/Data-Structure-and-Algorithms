package Codeforces_Problem;
import java.util.*;
import java.io.*;
import static java.lang.Math.abs;

public class PermutationSwap {
    // Cal GCD
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);

    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tastCase = Integer.parseInt(br.readLine().trim());

        while (tastCase--> 0) {
            int N = Integer.parseInt(br.readLine().trim());
            StringTokenizer str = new StringTokenizer(br.readLine());

            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = Integer.parseInt(str.nextToken());
            }

            int k = abs(A[0] - 1);
            for (int i = 1; i < N; i++) {
                k = gcd(k, abs(A[i]- (i + 1)));
            }
            System.out.println(k);
        }
    }
}
