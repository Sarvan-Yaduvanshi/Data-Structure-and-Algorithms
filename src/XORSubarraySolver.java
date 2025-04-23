import java.io.*;
import java.util.*;

public class XORSubarraySolver {
    private int arrayLength;
    private long threshold;
    private List<Integer> numbers;

    public void readInput(BufferedReader reader) throws IOException {
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        arrayLength = Integer.parseInt(tokenizer.nextToken());
        threshold = Long.parseLong(tokenizer.nextToken());
        numbers = new ArrayList<>();
        tokenizer = new StringTokenizer(reader.readLine());
        for (int i = 0; i < arrayLength; ++i) {
            numbers.add(Integer.parseInt(tokenizer.nextToken()));
        }
    }
    public int findMinimumLength() {
        if (threshold == 0) return 1;
        int minimumLength = Integer.MAX_VALUE;
        for (int i = 0; i < arrayLength; ++i) {
            int currentMax = 0;
            for (int j = i + 1; j < arrayLength && j < i + 65; ++j) {
                for (int p = i; p < j; ++p) {
                    currentMax = Math.max(currentMax, numbers.get(p) ^ numbers.get(j));
                }
                if (currentMax >= threshold) {
                    minimumLength = Math.min(minimumLength, j - i + 1);
                    break;
                }
            }
        }
        return (minimumLength == Integer.MAX_VALUE ? -1 : minimumLength);
    }
    public int findMinimumLengthAlternative() {
        if (threshold == 0) return 1;
        int minimumLength = Integer.MAX_VALUE;
        int[] prefixXor = new int[arrayLength + 1];
        for (int i = 0; i < arrayLength; ++i) {
            prefixXor[i + 1] = prefixXor[i] ^ numbers.get(i);
        }
        for (int i = 0; i < arrayLength; ++i) {
            for (int j = i + 1; j <= arrayLength; ++j) {
                if ((prefixXor[j] ^ prefixXor[i]) >= threshold) {
                    minimumLength = Math.min(minimumLength, j - i);
                    break;
                }
            }
        }
        return (minimumLength == Integer.MAX_VALUE ? -1 : minimumLength);
    }

    public static void solveTestCase(BufferedReader reader) throws IOException {
        XORSubarraySolver solver = new XORSubarraySolver();
        solver.readInput(reader);
        System.out.println(solver.findMinimumLength());
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(reader.readLine());
        for (int t = 0; t < testCases; ++t) {
            solveTestCase(reader);
        }
    }
}



