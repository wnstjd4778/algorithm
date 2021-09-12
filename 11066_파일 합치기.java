import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static int[] sum = new int[502];
    public static int[][] dp = new int[502][502];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            int size = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i = 1; i <= size; i++) {
                int num = Integer.parseInt(st.nextToken());
                sum[i] = sum[i - 1] + num;
            }
            for(int k = 1; k < size; k++) {
                for(int i = 1; i <= size - k; i++) {
                    dp[i][i + k] = Integer.MAX_VALUE;
                    for(int j = i; j < i + k; j++) {
                        dp[i][i + k] = Math.min(dp[i][i + k], dp[i][j] + dp[j + 1][i + k]);
                    }
                    dp[i][i + k] += (sum[i + k] - sum[i - 1]);
                }
            }
            System.out.println(dp[1][size]);
        }
    }
}
