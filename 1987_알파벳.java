import java.io.*;
import java.util.*;

public class Main {
    static int r, c;
    static int[][] arr;
    static boolean[] check = new boolean[26];
    static int[] dx = {1,0,-1,0};
    static int[] dy = {0, 1, 0, -1};
    static int max;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        arr = new int[r][c];
        for(int i = 0; i < r; i++) {
            String str = br.readLine();
            for(int j = 0; j < c; j++) {
                arr[i][j] = str.charAt(j) - 'A';
            }
        }
        check[arr[0][0]] = true;
        dfs(0, 0, 0);
        System.out.println(max + 1);
    }

    static void dfs(int row, int col, int depth) {
        for(int i = 0; i < 4; i++) {
            int nr = row + dx[i];
            int nc = col + dy[i];
            if(nr >= 0 && nc >= 0 && nr < r && nc < c && !check[arr[nr][nc]]) {
                check[arr[nr][nc]] = true;
                dfs(nr, nc, depth + 1);
                check[arr[nr][nc]] = false;
            } else {
                max = Math.max(max, depth);
            }
        }
    }
}
