import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class BrogrammingContest {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        int t = Integer.parseInt(tokenizer.nextToken());

        while (t-- > 0) {
            tokenizer = new StringTokenizer(reader.readLine());
            int n = Integer.parseInt(tokenizer.nextToken());
            String s = reader.readLine();

            int moves = 0;

            for (int i = 1; i < n; i++) {
                if (s.charAt(i) != s.charAt(i - 1)) {
                    moves++;
                }
            }

            if (s.charAt(0) == '1') {
                moves++;
            }

            System.out.println(moves);
        }
    }
}
