import java.io.*;
import java.util.*;


public class Main {
    static int n;
    static int[][] arr;
    static int[][] dist;
    static final int INF = Integer.MAX_VALUE;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int test = 1;
        while (true) {
            n = Integer.parseInt(br.readLine());
            if(n == 0) {
                break;
            }
            arr = new int[n][n];
            dist = new int[n][n];
            for(int i = 0; i < n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for(int j = 0; j < n; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            bfs(0, 0);
            sb.append("Problem ").append(test).append(": ").append(dist[n - 1][n - 1]).append('\n');
            test++;
        }
        System.out.println(sb);
    }

    static void bfs(int x, int y) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                dist[i][j] = INF;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        q.offer(x);
        q.offer(y);
        dist[x][y] = arr[x][y];

        while (!q.isEmpty()) {
            int ax = q.poll();
            int ay = q.poll();
            for(int i = 0; i < 4; i++) {
                int nx = ax + dx[i];
                int ny = ay + dy[i];
                if(nx >= 0 && nx < n && ny >= 0 && ny < n && dist[nx][ny] > dist[ax][ay] + arr[nx][ny]) {
                    dist[nx][ny] = dist[ax][ay] + arr[nx][ny];
                    q.offer(nx);
                    q.offer(ny);
                }
            }
        }
    }
}
