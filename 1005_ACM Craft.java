import java.io.*;
import java.util.*;

public class Main {

    static int round;
    static int n;
    static int k;
    static int[] costs;
    static int[][] curriculum;
    static int win;
    static int[] dp;
    static int[] answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        round = Integer.parseInt(br.readLine());
        answer = new int[round];
        for(int r = 0; r < round; r++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());
            costs = new int[n];
            st = new StringTokenizer(br.readLine());
            for(int i = 0; i < n; i++) {
                costs[i] = Integer.parseInt(st.nextToken());
            }
            curriculum = new int[n][n];
            int before;
            int after;
            for(int i = 0; i < k; i++) {
                st = new StringTokenizer(br.readLine());
                before = Integer.parseInt(st.nextToken());
                after = Integer.parseInt(st.nextToken());
                curriculum[before - 1][after - 1] = 1;
            }
            win = Integer.parseInt(br.readLine());
            dp = new int[n];
            for(int i = 0; i < n; i++) {
                dp[i] = -1;
            }
            answer[r] = dp(win - 1);
        }
        for(int r : answer) {
            System.out.println(r);
        }
    }

    static int dp(int target) {
        if(dp[target] != - 1) {
            return dp[target];
        }
        int currentCost = 0;
        for(int i = 0; i < n; i++) {
            if(curriculum[i][target] == 1) {
                currentCost = Math.max(currentCost, dp(i));
            }
        }
        dp[target] = currentCost + costs[target];
        return dp[target];
    }
}
