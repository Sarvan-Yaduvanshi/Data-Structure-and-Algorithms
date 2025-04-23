package Codeforces_Problem;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class FlagFreeCode {

    public static void processMatrix(int rows, int cols, String directions, int[][] matrix) {
        int[][] path = new int[directions.length() + 1][2];
        int r = 0, c = 0;
        path[0][0] = r;
        path[0][1] = c;
        for (int i = 0; i < directions.length(); i++) {
            if (directions.charAt(i) == 'D') {
                r++;
            } else {
                c++;
            }
            path[i + 1][0] = r;
            path[i + 1][1] = c;
        }

        for (int k = 0; k < path.length; k++) {
            r = path[k][0];
            c = path[k][1];
            if (k < path.length - 1) {
                int nextR = path[k + 1][0];
                int nextC = path[k + 1][1];
                if (nextR > r) {
                    int rowSum = 0;
                    for (int j = 0; j < cols; j++) {
                        rowSum += matrix[r][j];
                    }
                    matrix[r][c] = - (rowSum - matrix[r][c]);
                } else {
                    int colSum = 0;
                    for (int i = 0; i < rows; i++) {
                        colSum += matrix[i][c];
                    }
                    matrix[r][c] = - (colSum - matrix[r][c]);
                }
            } else {
                int colSum = 0;
                for (int i = 0; i < rows; i++) {
                    colSum += matrix[i][c];
                }
                matrix[r][c] = - (colSum - matrix[r][c]);
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(reader.readLine().trim());

        for (int t = 0; t < testCases; t++) {
            StringTokenizer st = new StringTokenizer(reader.readLine());
            int rows = Integer.parseInt(st.nextToken());
            int cols = Integer.parseInt(st.nextToken());

            String directions = reader.readLine().trim();
            int[][] matrix = new int[rows][cols];

            for (int i = 0; i < rows; i++) {
                st = new StringTokenizer(reader.readLine());
                for (int j = 0; j < cols; j++) {
                    matrix[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            processMatrix(rows, cols, directions, matrix);
            System.out.println();
        }
    }
}