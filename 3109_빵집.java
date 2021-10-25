import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int n, m;
    static char[][] arr;
    static int val;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new char[n][m];
        for(int i = 0; i < n; i++) {
            arr[i] = br.readLine().toCharArray();
        }
        for(int i = 0; i < n; i++) {
            if(check(i, 0)) {
                val++;
            }
        }
        System.out.println(val);
    }

    static boolean check(int x, int y) {
        arr[x][y] = '-';
        if(y == m - 1) {
            return true;
        }
        if(x > 0 && arr[x - 1][y + 1] == '.') {
            if(check(x - 1, y + 1)) {
                return true;
            }
        }
        if(arr[x][y + 1] == '.') {
            if(check(x, y + 1)) {
                return true;
            }
        }
        if(x + 1 < n && arr[x + 1][y + 1] == '.') {
            if(check(x + 1, y + 1)) {
                return true;
            }
        }
        return false;
    }
}

