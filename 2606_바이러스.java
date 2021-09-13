import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static int[][] check;
    public static boolean[] checked;
    public static int n, m, count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());
        checked = new boolean[n + 1];
        check = new int[n + 1][n + 1];
        for(int i = 1; i <= m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            check[x][y] = check[y][x] = 1;
        }
        dfs(1);
        System.out.println(count - 1);
    }

    public static void dfs(int i) {
        checked[i] = true;
        count++;
        for(int j = 1; j <= n; j++) {
            if(checked[j] == false && check[i][j] == 1) {
                dfs(j);
            }
        }
    }
}
