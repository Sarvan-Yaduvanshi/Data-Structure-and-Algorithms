package Codeforces_Problem;
import java.io.*;

public class Twin_Permutations {
    public static void main(String[] args) throws IOException {
        FastReader fr = new FastReader();
        int testCase = fr.nextInt();

        StringBuilder sb = new StringBuilder();

        while (testCase-- > 0) {
            int num = fr.nextInt();

            for (int i = 0; i < num; i++) {
                int a = fr.nextInt();
                sb.append(num + 1 - a).append(" ");
            }
            sb.append("\n");
        }

        System.out.print(sb);
    }

    // FastReader for Super-Fast Input
    static class FastReader {
        private final DataInputStream din;
        private final byte[] buffer = new byte[1 << 16];
        private int bufferPointer = 0, bytesRead = 0;

        public FastReader() {
            din = new DataInputStream(System.in);
        }

        private void fillBuffer() throws IOException {
            bytesRead = din.read(buffer, bufferPointer = 0, buffer.length);
            if (bytesRead == -1) buffer[0] = -1;
        }

        private byte read() throws IOException {
            if (bufferPointer == bytesRead) fillBuffer();
            return buffer[bufferPointer++];
        }

        public int nextInt() throws IOException {
            int result = 0;
            byte b = read();
            while (b <= ' ') b = read(); // Skip spaces and newlines
            boolean neg = (b == '-');
            if (neg) b = read();
            do {
                result = result * 10 + (b - '0');
                b = read();
            } while (b >= '0' && b <= '9');
            return neg ? -result : result;
        }
    }
}
