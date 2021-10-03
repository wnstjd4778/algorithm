import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        if(n == 15) {
            n = 0;
        }
        if(m == 28) {
            m = 0;
        }
        if(k == 19) {
            k = 0;
        }
        int ans = 0;
        for(int i = 1; i <= 15 * 28 * 19; i++) {
            if(i % 15 == n && i % 28 == m && i % 19 == k) {
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
}


