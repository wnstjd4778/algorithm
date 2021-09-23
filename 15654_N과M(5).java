import java.io.*;
import java.util.*;


public class Main {
    static int n, m;
    static StringBuilder sb = new StringBuilder();
    static int[] arr;
    static int[] result;
    static boolean[] check;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n];
        result = new int[n];
        check = new boolean[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        dfs(0);
        System.out.println(sb);

    }

    public static void dfs(int depth) {

        if(depth == m) {
            for(int i = 0; i < m; i++) {
                sb.append(result[i]).append(' ');
            }
            sb.append('\n');
            return;
        }
        for(int i = 0; i < n; i++) {
            if(!check[i]) {
                check[i] = true;
                result[depth] = arr[i];
                dfs(depth + 1);
                check[i] = false;
            }
        }
    }
}
