import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int n,m;
    static int[][] arr;
    static boolean[][] checked;
    static Queue<int[]> q;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        arr= new int[n][m];
        q = new LinkedList<>();
        checked = new boolean[n][m];
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if(arr[i][j] == 1) {
                    q.offer(new int[] {i, j ,0});
                    checked[i][j] = true;
                }
            }
        }
        System.out.println(bfs());
    }

    public static int bfs() {
        int day = -1;
        boolean flag = true;
        // 시작부터 모든 토마토가 다 익었는지 확인
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(arr[i][j] == 0) {
                    flag = false;
                }
            }
        }
        if(flag) return 0;
        while (!q.isEmpty()) {
            int size = q.size();
            while (size-- > 0) {
                int[] now = q.poll();
                int x = now[0];
                int y = now[1];
                day = now[2];
                arr[x][y] = 1;
                for(int i = 0; i < 4; i++) {
                    int nx = x + dx[i];
                    int ny = y + dy[i];
                    if(nx >= 0 && nx < n && ny >= 0 && ny < m && checked[nx][ny] == false && arr[nx][ny] == 0) {
                        checked[nx][ny] = true;
                        q.offer(new int[] {nx, ny, day + 1});
                    }
                }
            }
        }
        // 모든 토마토가 다 익었는지 확인
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(arr[i][j] == 0) {
                    day = -1;
                }
            }
        }
        return day;
    }
}
