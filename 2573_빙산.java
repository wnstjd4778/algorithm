import java.io.*;
import java.util.*;


public class Main {
    static int n, m, count, test;
    static int[][] arr;
    static int[][] melting;
    static boolean[][] visited;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n][m];
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        while (true) {
            count = 0;
            visited = new boolean[n][m];
            melting = new int[n][m];
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < m; j++) {
                    if(!visited[i][j] && arr[i][j] > 0) {
                        dfs(i, j);
                        count++;
                        if(count > 1) {
                            System.out.println(test);
                            return;
                        }
                    }
                }
            }
            if(count == 0) {
                System.out.println(0);
                return;
            }
            test++;
        }
    }
    static void dfs(int x, int y){
        visited[x][y] = true;
        for(int i = 0; i<4; i++){
            int tx = x + dx[i];
            int ty = y + dy[i];

            if(tx>=0 && ty>=0 && tx<n && ty<m){
                if(!visited[tx][ty]){//방문한 빙산이 0이 되었을 경우 논리적오류가 발생할수 있기 때문
                    if(arr[tx][ty] <= 0){//인접한 물의 칸 만큼 -1 해준다.
                        arr[x][y] -= 1;
                    }
                    else dfs(tx, ty);
                }
            }
        }
    }
    static class XY {
        int x, y;
        XY(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
