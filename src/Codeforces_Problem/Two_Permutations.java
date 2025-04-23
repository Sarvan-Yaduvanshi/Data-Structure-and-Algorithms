package Codeforces_Problem;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Two_Permutations {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (testCase--> 0) {

            StringTokenizer st = new StringTokenizer(br.readLine().trim());

            int n = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (a + b + 2 <= n || (a == b && a == n)) {
                sb.append("Yes\n");

            } else {
                sb.append("No\n");
            }
        }

        System.out.print(sb);
        br.close();
    }
}
