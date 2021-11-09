import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static class Node{
        int num, len;
        public Node(int num, int len) {
            this.num = num;
            this.len = len;
        }
    }
    static List<Node>[] list;
    static boolean visit[];
    static int ans;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        list = new ArrayList[n + 1];
        for(int i = 1; i < n + 1; i++) {
            list[i] = new ArrayList<Node>();
        }
        for(int i = 0; i < n - 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            int len = Integer.parseInt(st.nextToken());
            list[from].add(new Node(to, len));
            list[to].add(new Node(from, len));
        }
        ans = 0;
        for(int i = 1; i <= n; i++) {
            visit = new boolean[n + 1];
            visit[i] = true;
            dfs(i, 0);
        }
        System.out.println(ans);
    }

    static void dfs(int num, int dim) {
        for(Node node : list[num]) {
            if(!visit[node.num]) {
                visit[node.num] = true;
                dfs(node.num, dim + node.len);
            }
        }
        ans = (ans < dim) ? dim : ans;
    }
}
