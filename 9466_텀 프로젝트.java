import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static int[] arr;
    static boolean[] check;
    static boolean[] visited;
    static int count;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            n = Integer.parseInt(br.readLine());
            arr = new int[n + 1];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i = 1; i <= n; i++) {
                int num = Integer.parseInt(st.nextToken());
                arr[i] = num;
            }
            check = new boolean[n + 1];
            visited = new boolean[n + 1];
            count = 0;
            for(int i = 1; i <= n; i++) {
                if(!check[i]) {
                    dfs(i);
                }
            }
            sb.append(n - count).append('\n');
        }
        System.out.println(sb);
    }

    static void dfs(int now) {
        if(visited[now]) {
            check[now] = true;
            count++;
        } else {
            visited[now] = true;
        }

        int next = arr[now];
        if(!check[next]) {
            dfs(next);
        }
        visited[now] = false;
        check[now] = true;
    }
}
