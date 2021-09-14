import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int n, m;
    static int[][] arr;
    static boolean[][][] visited;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n][m];
        visited = new boolean[n][m][2]; // 벽을 뚫고 지나간 경우와 벽을 안 뚫고 지나간 경우로 나눔
        for(int i = 0; i < n; i++) {
            String val = br.readLine();
            for(int j = 0; j < m; j++) {
                arr[i][j] = val.charAt(j) - '0';
            }
        }
        bfs();
    }
    static class info {
        int x, y, dis, wall;
        public info(int x, int y, int dis, int wall) {
            this.x = x;
            this.y = y;
            this.dis = dis;
            this.wall = wall;
        }
    }
    public static void bfs() {
        Queue<info> queue = new LinkedList<>();
        queue.offer(new info(0,0,1,0));
        visited[0][0][0] = true;
        visited[0][0][1] = true;

        while (!queue.isEmpty()) {
            info temp = queue.poll();
            if(temp.x == n - 1 && temp.y == m - 1) {
                System.out.println(temp.dis);
                return;
            }
            for(int i = 0; i < 4; i++) {
                int nx = temp.x + dx[i];
                int ny = temp.y + dy[i];
                int breakWall = temp.wall;
                int count = temp.dis;
                if(nx >= 0 && ny >= 0 && nx < n && ny < m) {
                    // (nx,ny)가 벽인 경우
                    if(arr[nx][ny] == 1) {
                        // 벽을 부순 횟수가 0이고 방문하지 않았을 경우
                        if(breakWall == 0 && !visited[nx][ny][1]) {
                            visited[nx][ny][1] = true;
                            queue.offer(new info(nx, ny, count + 1, 1));
                        }
                    }
                    else {
                        if(!visited[nx][ny][breakWall]) {
                            visited[nx][ny][breakWall] = true;
                            queue.offer(new info(nx, ny, count + 1, breakWall));
                        }
                    }
                }
            }
        }
        System.out.println(-1);
    }
}
