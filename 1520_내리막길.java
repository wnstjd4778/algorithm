import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static int row, col;
    public static int[][] arr;
    public static int[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        row = Integer.parseInt(st.nextToken());
        col = Integer.parseInt(st.nextToken());
        arr = new int[501][501];
        dp = new int[501][501];
        for(int i = 1 ; i <= row; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 1; j <= col; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                dp[i][j] = -1;
            }
        }
        System.out.println(dfs(1,1));
    }

    public static int dfs(int x, int y) {
        int[] moveX = {0,1,0,-1};
        int[] moveY = {1,0,-1,0};
        if(x == row && y == col) { // 도착점이면 1리턴
            return 1;
        }
        if(dp[x][y] != -1) { // 방문한 적이 있다면
            return dp[x][y];
        }

        if(dp[x][y] == -1) { // 방문한 적이 없다면
            dp[x][y] = 0; // 방문 표시
            for(int i = 0; i < moveX.length; i++) {
                int nx = x + moveX[i];
                int ny = y + moveY[i];
                if(nx > 0 && nx <= row && ny > 0 && ny <= col) {
                    if(arr[x][y] > arr[nx][ny]) {
                        dp[x][y] += dfs(nx, ny);
                    }
                }
            }
        }
        return dp[x][y];
    }

}
