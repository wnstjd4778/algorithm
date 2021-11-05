import java.io.*;
import java.util.*;

public class Main {
    static int r, c, k;
    static int[][] arr;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int max;
    static boolean[][] check;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        arr = new int[r][c];
        for(int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            for(int j = b; j < d; j++) {
                for(int g = a; g < c; g++) {
                    arr[j][g]++;
                }
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        check = new boolean[r][c];
        int count = 0;
        for(int i = r - 1; i >= 0; i--) {
            for(int j = 0; j < c; j++) {
                if(!check[i][j] && arr[i][j] == 0) {
                    check[i][j] = true;
                    max++;
                    dfs(i, j, 1);
                    count++;
                    list.add(max);
                    max = 0;
                }
            }
        }
        System.out.println(count);
        Collections.sort(list);
        for(int num : list) {
            System.out.print(num + " ");
        }
    }

    static void dfs(int row, int col, int depth) {
        for(int i = 0; i < 4; i++) {
            int nr = row + dx[i];
            int nc = col + dy[i];
            if(nr >= 0 && nc >= 0 && nr < r && nc < c && !check[nr][nc] && arr[nr][nc] == 0) {
                check[nr][nc] = true;
                max++;
                dfs(nr, nc, depth + 1);
            }
        }
    }
}
