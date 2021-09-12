import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static int[] arr;
    public static boolean[][] dp = new boolean[2001][2001];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        arr = new int[n + 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int m = Integer.parseInt(br.readLine());
        solve(arr, n);
        while (m-- > 0) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            if(dp[start][end]) {
                sb.append(1).append('\n');
            } else {
                sb.append(0).append('\n');
            }
        }
        System.out.println(sb);
    }

    public static void solve(int[] arr, int n) {
        for(int i = 1; i <= n; i++) { // i번째부터 i번째까지 팰린드롬인지
            dp[i][i] = true;
        }
        for(int i = 1; i <= n - 1; i++) { // i번째에서 i+1반째까지 팰린드롬인지
            if(arr[i] == arr[i + 1]) {
                dp[i][i + 1] = true;
            }
        }
        for(int i = 2; i < n; i++) { // i번째에서 j번째까지 팰린드롬인지
            for(int j = 1; j <= n - i; j++) {
                
                if(arr[j] == arr[j + i] && dp[j + 1][j + i - 1]) {
                    dp[j][j + i] = true;
                }
            }
        }
    }
}
