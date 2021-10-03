import java.io.*;
import java.util.*;


public class Main {
    static int n, m;
    static int[][] map;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new int[m][n];
        for(int i = 0; i < m; i++) {
            String str = br.readLine();
            for(int j = 0; j < n; j++) {
                map[i][j] = str.charAt(j) - '0';
            }
        }
        System.out.println(bfs());
    }
    public static int bfs() {
        PriorityQueue<XY> q = new PriorityQueue<>();
        q.offer(new XY(0, 0, 0));
        boolean[][] check = new boolean[m][n];
        check[0][0] = true;
        while (!q.isEmpty()) {
            XY xy = q.poll();
            if(xy.x == m - 1 && xy.y == n - 1) {
                return xy.count;
            }
            for(int i = 0; i < 4; i++) {
                int nx = xy.x + dx[i];
                int ny = xy.y + dy[i];
                if(nx >= 0 && ny >= 0 && nx < m && ny < n && !check[nx][ny]) {
                    if(map[nx][ny] == 1) {
                        q.offer(new XY(nx, ny, xy.count + 1));
                    } else {
                        q.offer(new XY(nx, ny, xy.count));
                    }
                    check[nx][ny] = true;
                }
            }
        }
        return 0;
    }

    public static class XY implements Comparable<XY>{
        int x, y, count;
        XY(int x, int y, int count) {
            this.x = x;
            this.y = y;
            this.count = count;
        }

        @Override
        public int compareTo(XY o) {
            return count - o.count;
        }
    }
}


