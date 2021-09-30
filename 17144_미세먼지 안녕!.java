import java.io.*;
import java.util.*;


public class Main {
    static int n, m, r;
    static int[][] map;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static ArrayList<Integer> air;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());
        map = new int[n][m];
        int air = 0;
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if(map[i][j] == -1) {
                    air = i;
                }
            }
        }
        for(int i = 0; i < r; i++) {
            diffusion();
            circuit(air);

        }

        int sum = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++){
                sum += map[i][j];
            }
        }
        System.out.println(sum + 2);
    }
    public static void diffusion() {
        int[][] mapCopy = new int[n][m];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                mapCopy[i][j] = map[i][j];
            }
        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(map[i][j] != 0) {
                    for(int k = 0; k < 4; k++) {
                        int nx = i + dx[k];
                        int ny = j + dy[k];
                        if(nx >= 0 && ny >= 0 && nx < n && ny < m && map[nx][ny] != -1) {
                            int num = map[i][j] / 5;
                            mapCopy[nx][ny] += num;
                            mapCopy[i][j] -= num;
                        }
                    }
                }
            }
        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                map[i][j] = mapCopy[i][j];
            }
        }
    }

    static void circuit(int air) {

        int newR = air - 1;
        // 윗부분
        for (int i = newR - 1; i > 0; i--) {
            map[i][0] = map[i - 1][0];
        }
        for (int i = 0; i < m - 1; i++) {
            map[0][i] = map[0][i + 1];
        }
        for (int i = 0; i < newR; i++) {
            map[i][m - 1] = map[i + 1][m - 1];
        }
        for (int i = m - 1; i > 0; i--) {
            map[newR][i] = map[newR][i - 1];
        }
        map[newR][1] = 0;

        newR = air;
        // 밑부분
        for (int i = newR; i < n - 1; i++) {
            map[i][0] = map[i + 1][0];
        }
        for (int i = 0; i < m - 1; i++) {
            map[n - 1][i] = map[n - 1][i + 1];
        }
        map[newR][0] = -1;
        for (int i = n - 1; i >= newR; i--) {
            map[i][m - 1] = map[i - 1][m - 1];
        }
        for (int i = m - 1; i > 0; i--) {
            map[newR][i] = map[newR][i - 1];
        }
        map[newR][1] = 0;
    }
}
