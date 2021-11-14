import java.io.*;
import java.util.*;

public class Main {

    static int n;
    static char[][] map;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        map = new char[n][n];
        for(int i = 0; i < n; i++) {
            map[i] = br.readLine().toCharArray();
        }
        int ans = Integer.MAX_VALUE;
        for(int bit = 0; bit < (1 << n) - 1; bit++) {
            int sum = 0;
            for(int b = 0; b < n; b++) {
                int back = 0;
                for(int a = 0; a < n; a++) {
                    char cur = map[a][b];
                    if((bit & (1 << a)) != 0) {
                        cur = reverse(a, b);
                    }
                    if(cur == 'T') {
                        back++;
                    }
                }
                sum += Math.min(back, n - back);
            }
            ans = Math.min(ans, sum);
        }
        System.out.println(ans);
    }
    static char reverse(int y, int x) {
        if(map[y][x] == 'T') {
            return 'H';
        } else {
            return 'T';
        }
    }
}
