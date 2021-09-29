import java.io.*;
import java.util.*;


public class Main {
    static int n;
    static int[] result;
    static int[] arr;
    static boolean[] check;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            check = new boolean[n];
            if(n == 0) {
                break;
            }
            arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            result = new int[6];
            dfs(-1, 0);
            sb.append('\n');
        }
        System.out.println(sb);
    }
    public static void dfs(int x, int depth) {
        if(depth == 6) {
            for(int val : result) {
                sb.append(val).append(' ');
            }
            sb.append('\n');
            return;
        }
        for(int i = 0; i < n; i++) {
            if(!check[i] && i > x) {
                check[i] = true;
                result[depth] = arr[i];
                dfs(i, depth + 1);
                check[i] = false;
            }
        }
    }
}
