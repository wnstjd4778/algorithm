import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[] dx = {-1, -1, 1, 1, -2, -2, 2, 2};
    static int[] dy = {2, -2, 2, -2, -1, 1, -1, 1};
    static int n;
    static int[][] arr;
    static boolean[][] visited;
    static int nowX, nowY, resultX, resultY;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        while (size-- > 0) {
            n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            nowX = Integer.parseInt(st.nextToken());
            nowY = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            resultX = Integer.parseInt(st.nextToken());
            resultY = Integer.parseInt(st.nextToken());
            arr = new int[n][n];
            visited = new boolean[n][n];
            bfs();
            System.out.println(arr[resultX][resultY]);
        }
    }
    public static void bfs() {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {nowX, nowY});
        while (!queue.isEmpty()) {
            int[] num = queue.poll();
            int x = num[0];
            int y = num[1];
            if(x == resultX && resultY == y) {
                return;
            }
            visited[x][y] = true;
            for(int i = 0; i < 8; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if(nx >= 0 && nx < n && ny >= 0 && ny < n && visited[nx][ny] == false) {
                    queue.offer(new int[] {nx, ny});
                    arr[nx][ny] = arr[x][y] + 1;
                    visited[nx][ny] = true;
                }
            }

        }
    }
}
