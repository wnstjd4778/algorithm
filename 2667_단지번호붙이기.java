import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static int[][] arr;
    public static boolean[][] checked;
    public static int n, count;
    public static int[] num = new int[625];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n + 1][n + 1];
        checked = new boolean[n + 1][n + 1];
        for(int i = 1; i <= n; i++) {
            String a = br.readLine();
            for(int j = 1; j <= n; j++) {
                arr[i][j] = a.charAt(j - 1) - '0';
            }
        }
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                if(checked[i][j] == false && arr[i][j] == 1) {
                    dfs(i,j);
                    count++;
                }
            }
        }
        Arrays.sort(num);
        System.out.println(count);
        for(int i = 0; i < num.length; i++) {
            if(num[i] != 0) {
                System.out.println(num[i]);
            }
        }
    }

    public static void dfs(int x, int y) {
        if(checked[x][y] == false) {
            checked[x][y] = true;
            num[count]++;
            if(y < n && arr[x][y] == arr[x][y + 1]) {
                dfs(x, y + 1);
            }
            if (x < n && arr[x][y] == arr[x + 1][y]) {
                dfs(x + 1, y);
            }
            if (x > 0 && arr[x][y] == arr[x - 1][y]) {
                dfs(x - 1, y);
            }
            if (y > 0 && arr[x][y] == arr[x][y - 1]) {
                dfs(x, y - 1);
            }
        }
    }
}
