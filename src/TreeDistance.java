import java.io.*;
import java.util.*;

public class TreeDistance {

    static int nodeCount;
    static List<Integer> values;
    static List<Long> prefixSum;
    static List<Integer> xorPrefix;
    static List<Long> xorSum;
    static long totalSum;
    static int totalXor;

    static class Node {
        long value;
        int parent;

        Node(long value, int parent) {
            this.value = value;
            this.parent = parent;
        }
    }

    static Map<Long, Node> nodeMap = new HashMap<>();
    static Map<Long, Integer> xorMap = new HashMap<>();

    static class Range {
        long left, right;

        Range(long left, long right) {
            this.left = left;
            this.right = right;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Range range = (Range) o;
            return left == range.left && right == range.right;
        }

        @Override
        public int hashCode() {
            return Objects.hash(left, right);
        }
    }

    static Map<Range, Long> rangeSumMap = new HashMap<>();
    static int baseXor;

    static int computeXor(long x) {
        if (x <= nodeCount)
            return xorPrefix.get((int) x);
        if (xorMap.containsKey(x))
            return xorMap.get(x);
        int result = (x % 2 == 1) ? baseXor : (baseXor ^ computeXor(x / 2));
        xorMap.put(x, result);
        return result;
    }

    static long computeSum(long l, long r) {
        if (l > r)
            return 0;
        if (r <= nodeCount)
            return xorSum.get((int) r) - xorSum.get((int) l - 1);
        if (l <= nodeCount)
            return (xorSum.get(nodeCount) - xorSum.get((int) l - 1)) + computeSum(nodeCount + 1, r);
        Range key = new Range(l, r);
        if (rangeSumMap.containsKey(key))
            return rangeSumMap.get(key);
        long total = r - l + 1;
        long evenCount = r / 2 - (l - 1) / 2;
        long oddCount = total - evenCount;
        long result = oddCount * baseXor;
        long start = (l % 2 == 0 ? l / 2 : (l + 1) / 2);
        long end = r / 2;
        result += (baseXor == 0 ? computeSum(start, end) : evenCount - computeSum(start, end));
        rangeSumMap.put(key, result);
        return result;
    }

    static Node computeNode(long x) {
        if (x <= nodeCount)
            return new Node(prefixSum.get((int) x), xorPrefix.get((int) x));
        if (nodeMap.containsKey(x))
            return nodeMap.get(x);
        long halfMax = x / 2;
        long halfNodes = (nodeCount + 1) / 2;
        long t1 = 0;
        if ((nodeCount + 1) % 2 == 1)
            t1 = computeXor(halfNodes);
        long lowerBound = ((nodeCount + 1) % 2 == 1 ? halfNodes + 1 : halfNodes);
        long upperBound = (x % 2 == 1 ? halfMax : halfMax - 1);
        long midSum = (lowerBound <= upperBound ? 2 * computeSum(lowerBound, upperBound) : 0);
        int t2 = (x % 2 == 0 ? computeXor(halfMax) : 0);
        long total = totalSum + t1 + midSum + t2;
        int parent = (x % 2 == 1 ? baseXor : (baseXor ^ computeXor(x / 2)));
        nodeMap.put(x, new Node(total, parent));
        return new Node(total, parent);
    }

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int testCases = Integer.parseInt(reader.readLine().trim());
            while (testCases-- > 0) {
                StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
                nodeCount = Integer.parseInt(tokenizer.nextToken());
                long left = Long.parseLong(tokenizer.nextToken());
                long right = Long.parseLong(tokenizer.nextToken());

                values = new ArrayList<>(Collections.nCopies(nodeCount + 1, 0));
                prefixSum = new ArrayList<>(Collections.nCopies(nodeCount + 1, 0L));
                xorPrefix = new ArrayList<>(Collections.nCopies(nodeCount + 1, 0));
                xorSum = new ArrayList<>(Collections.nCopies(nodeCount + 1, 0L));

                tokenizer = new StringTokenizer(reader.readLine());
                for (int i = 1; i <= nodeCount; i++) {
                    values.set(i, Integer.parseInt(tokenizer.nextToken()));
                }

                for (int i = 1; i <= nodeCount; i++) {
                    prefixSum.set(i, prefixSum.get(i - 1) + values.get(i));
                    xorPrefix.set(i, xorPrefix.get(i - 1) ^ values.get(i));
                    xorSum.set(i, xorSum.get(i - 1) + xorPrefix.get(i));
                }

                totalSum = prefixSum.get(nodeCount);
                totalXor = xorPrefix.get(nodeCount);
                nodeMap.clear();
                xorMap.clear();
                rangeSumMap.clear();
                baseXor = ((nodeCount + 1) % 2 == 1 ? totalXor ^ computeXor((nodeCount + 1) / 2) : totalXor);

                Node rightNode = computeNode(right);
                Node leftNode = computeNode(left - 1);
                System.out.println(rightNode.value - leftNode.value);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}