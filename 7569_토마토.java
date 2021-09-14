import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int n, m, h;
    static int[][][] arr;
    static boolean[][][] checked;
    static Queue<int[]> q;
    static int[] dx = {0, 0, 0, 0, 1, -1};
    static int[] dy = {0, 0, 1, -1, 0, 0};
    static int[] dz = {1, -1, 0, 0, 0, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());
        arr = new int[h][n][m];
        q = new LinkedList<>();
        checked = new boolean[h][n][m];
        for(int k = 0; k < h; k++) {
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < m; j++) {
                    arr[k][i][j] = Integer.parseInt(st.nextToken());
                    if (arr[k][i][j] == 1) {
                        q.offer(new int[]{k, i, j, 0});
                        checked[k][i][j] = true;
                    }
                }
            }
        }
        System.out.println(bfs());
    }

    public static int bfs() {
        int day = -1;
        boolean flag = true;
        // 시작부터 모든 토마토가 다 익었는지 확인
        for(int k = 0; k < h; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (arr[k][i][j] == 0) {
                        flag = false;
                    }
                }
            }
        }
        if(flag) return 0;
        while (!q.isEmpty()) {
            int size = q.size();
            while (size-- > 0) {
                int[] now = q.poll();
                int z = now[0];
                int x = now[1];
                int y = now[2];
                day = now[3];
                arr[z][x][y] = 1;
                for(int i = 0; i < 6; i++) {
                    int nx = x + dx[i];
                    int ny = y + dy[i];
                    int nz = z + dz[i];
                    if(nz >= 0 && nz < h && nx >= 0 && nx < n && ny >= 0 && ny < m && checked[nz][nx][ny] == false && arr[nz][nx][ny] == 0) {
                        checked[nz][nx][ny] = true;
                        q.offer(new int[] {nz, nx, ny, day + 1});
                    }
                }
            }
        }
        // 모든 토마토가 다 익었는지 확인
        for(int k = 0; k < h; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (arr[k][i][j] == 0) {
                        day = -1;
                    }
                }
            }
        }
        return day;
    }
}
