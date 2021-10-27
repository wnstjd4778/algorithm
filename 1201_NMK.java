import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        System.out.println(solve(n, m, k));
    }

    static String solve(int n, int m, int k) {
        if(m + k - 1 > n || m * k < n) {
            return "-1";
        }

        int[] groupSize = new int[m];
        groupSize[0] = k;
        n -= k;
        if(m - 1 > 0) {
            int div = n / (m - 1);
            int remain = n % (m - 1);

            for(int i = 1; i < m; i++) {
                if(remain-- > 0) {
                    groupSize[i] = div + 1;
                } else {
                    groupSize[i] = div;
                }
            }
        }

        StringBuffer sb = new StringBuffer();
        int sIdx = 0;
        int eIdx = 0;
        for(int i = 0; i < m; i++) {
            sIdx = eIdx;
            eIdx += groupSize[i];
            for(int j = eIdx - 1; j >= eIdx - groupSize[i]; j--) {
                sb.append((j + 1) + " ");
            }
        }
        return sb.toString();
    }
}

