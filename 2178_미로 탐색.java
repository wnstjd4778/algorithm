import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {


    public static int[][] arr;
    public static boolean[][] checked;
    public static int n, m, count = Integer.MAX_VALUE;
    static int[] dx = { -1, 1, 0, 0 };
    static int[] dy = { 0, 0, -1, 1 };
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n][m];
        checked = new boolean[n][m];
        for(int i = 0; i < n; i++) {
            String a = br.readLine();
            for(int j = 0; j < m; j++) {
                arr[i][j] = a.charAt(j) - '0';
            }
        }
        dfs(0, 0);
        System.out.println(arr[n-1][m-1]);
    }

    public static void dfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {x,y});
        while (!queue.isEmpty()) {
            int now[] = queue.poll();
            int nowX = now[0];
            int nowY = now[1];
            for(int i = 0; i < 4; i++) {
                int nx = nowX + dx[i];
                int ny = nowY + dy[i];
                if(nx < 0 || ny <0 || nx >= n || ny >= m) {
                    continue;
                }
                if(checked[nx][ny] || arr[nx][ny] == 0) {
                    continue;
                }
                queue.offer(new int[] {nx, ny});
                arr[nx][ny] = arr[nowX][nowY] + 1;
                checked[nx][ny] = true;
            }
        }
    }
}
