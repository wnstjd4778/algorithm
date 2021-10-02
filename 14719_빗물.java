import java.io.*;
import java.util.*;


public class Main {
    static int n, m, sum;
    static int[] map;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        map = new int[m];
        for(int i = 0; i < m; i++) {
            int num = Integer.parseInt(st.nextToken());
            map[i] = num;
        }
        for(int i = 1; i < m - 1; i++) {
            int current = map[i];
            int leftMax = current;
            int rightMax = current;
            for(int k = i - 1; k >= 0; k--) {
                if(map[k] > current) {
                    leftMax = Math.max(leftMax, map[k]);
                }
            }
            for(int k = i + 1; k < m; k++) {
                if(map[k] > current) {
                    rightMax = Math.max(rightMax, map[k]);
                }
            }
            if(Math.min(leftMax, rightMax) > current) {
                sum += (Math.min(leftMax, rightMax) - map[i]);
            }
        }
        System.out.println(sum);
    }
}


