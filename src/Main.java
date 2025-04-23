import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder resultBuilder = new StringBuilder();

        int testCase = Integer.parseInt(br.readLine());

        while (testCase-- > 0) {
            StringTokenizer tokenizer = new StringTokenizer(br.readLine());
            int stickCount = Integer.parseInt(tokenizer.nextToken());
            int operLimit = Integer.parseInt(tokenizer.nextToken());

            long[] leftLengths = new long[stickCount];
            long[] rightLengths = new long[stickCount];
            long[] minLengths = new long[stickCount];

            StringTokenizer leftTokenizer = new StringTokenizer(br.readLine());
            for (int i = 0; i < stickCount; i++) {
                leftLengths[i] = Long.parseLong(leftTokenizer.nextToken());
            }

            StringTokenizer rightTokenizer = new StringTokenizer(br.readLine());
            for (int i = 0; i < stickCount; i++) {
                rightLengths[i] = Long.parseLong(rightTokenizer.nextToken());
            }

            long totalMaxSum = 0;
            for (int i = 0; i < stickCount; i++) {
                totalMaxSum += Math.max(leftLengths[i], rightLengths[i]);
                minLengths[i] = Math.min(leftLengths[i], rightLengths[i]);
            }

            Arrays.sort(minLengths);
            long additionalSum = 0;
            for (int i = stickCount - 1; i >= stickCount - (operLimit - 1); i--) {
                additionalSum += minLengths[i];
            }

            resultBuilder.append(totalMaxSum + additionalSum + 1).append("\n");
        }

        System.out.print(resultBuilder);
    }
}



