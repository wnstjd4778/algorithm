import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n + 1];
        int[][] t = new int[n + 1][3];
        dp[0] = n;
        for(int i = 2; i <= n; i++) {
            if(i % 3 == 0) {
                t[i][0] = i / 3;
            }
            if(i % 2 == 0) {
                t[i][1] = i / 2;
            }
            t[i][2] = i - 1;
            dp[i] = Math.min(Math.min(dp[t[i][0]], dp[t[i][1]]), dp[t[i][2]]) + 1;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(dp[n]).append('\n');
        int m = n, temp, minCount, minNum = 0;
        while (true) {
            sb.append(m + " ");
            if(m <= 1) break;
            minCount = n;
            for(int i = 0; i < 3; i++) {
                temp = t[m][i];
                if(minCount > dp[temp]) {
                    minCount = dp[temp];
                    minNum = temp;
                }
            }
            m = minNum;
        }
        System.out.println(sb);
    }
}
