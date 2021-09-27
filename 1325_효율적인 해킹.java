import java.io.*;
import java.util.*;


public class Main {

    static int n, m;
    static List<Integer>[] list;
    static int[] check = new int[10001];
    static int[] result = new int[10001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        check = new int[n + 1];
        result = new int[n + 1];
        list = new ArrayList[n + 1];
        for(int i = 1; i <= n; i++) {
            list[i] = new ArrayList<>();
        }
        for(int i = 1; i <= m; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            list[start].add(end);
        }
        for(int i = 1; i <= n; i++) {
            check = new int[n + 1];
            check[i] = 1;
            dfs(i);
        }
        int max = 0;
        for(int i = 1; i <= n; i++) {
            max = Math.max(max, result[i]);
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= n; i++) {
            if(max == result[i]) {
                sb.append(i).append(' ');
            }
        }
        System.out.println(sb);
    }
    public static void dfs(int x) {
        for(int next : list[x]) {
            if(check[next] == 0) {
                result[next]++;
                check[next] = 1;
                dfs(next);
            }
        }
    }
}
