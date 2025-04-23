import java.io.*;
import java.util.*;

public class DivisorQuerySolver {

    static List<Integer> getDivs(int num) {
        List<Integer> res = new ArrayList<>();
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                res.add(i);
                if (i != num / i) res.add(num / i);
            }
        }
        return res;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int len = Integer.parseInt(st.nextToken());
            int que = Integer.parseInt(st.nextToken());

            int[] arr = new int[len + 1];
            Map<Integer, List<Integer>> map = new HashMap<>();

            st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= len; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
                map.putIfAbsent(arr[i], new ArrayList<>());
                map.get(arr[i]).add(i);
            }

            for (List<Integer> lst : map.values()) {
                Collections.sort(lst);
            }

            while (que-- > 0) {
                st = new StringTokenizer(br.readLine());
                int val = Integer.parseInt(st.nextToken());
                int left = Integer.parseInt(st.nextToken());
                int right = Integer.parseInt(st.nextToken());

                long sum = 0;
                int ptr = left;
                int now = val;

                while (ptr <= right) {
                    List<Integer> divs = getDivs(now);
                    int nxt = right + 1;

                    for (int d : divs) {
                        if (d < 2 || !map.containsKey(d)) continue;
                        List<Integer> pos = map.get(d);
                        int idx = lowerBound(pos, ptr);
                        if (idx < pos.size() && pos.get(idx) <= right) {
                            nxt = Math.min(nxt, pos.get(idx));
                        }
                    }

                    if (nxt == right + 1) {
                        sum += (long) (right - ptr + 1) * now;
                        break;
                    }

                    sum += (long) (nxt - ptr) * now;

                    int div = arr[nxt];
                    while (now % div == 0) now /= div;

                    sum += now;
                    ptr = nxt + 1;
                }

                sb.append(sum).append("\n");
            }
        }
        System.out.print(sb);
    }

    static int lowerBound(List<Integer> lst, int val) {
        int l = 0, r = lst.size();
        while (l < r) {
            int mid = (l + r) >>> 1;
            if (lst.get(mid) < val) l = mid + 1;
            else r = mid;
        }
        return l;
    }
}











