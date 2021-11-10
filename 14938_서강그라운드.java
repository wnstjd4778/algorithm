import java.io.*;
import java.util.*;

public class Main {
    static int n, m, r;
    static int[] arr;
    static boolean[] check;
    static ArrayList<Node>[] list;
    static int ans;
    static int[] dist;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());
        arr = new int[n + 1];
        dist = new int[n + 1];
        st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        list = new ArrayList[n + 1];
        for(int i = 1; i <= n; i++) {
            list[i] = new ArrayList<>();
        }
        for(int i = 1; i <= r; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            list[a].add(new Node(b, c));
            list[b].add(new Node(a, c));
        }
        for(int i = 1; i <= n; i++) {
            solution(i);
        }
        System.out.println(ans);
    }

    static void solution(int k) {
        PriorityQueue<Node> q = new PriorityQueue<>();
        q.offer(new Node(k, 0));
        check = new boolean[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[k] = 0;
        int sum = 0;
        while (!q.isEmpty()) {
            Node cur = q.poll();
            if(check[cur.end]) {
                continue;
            }
            check[cur.end] = true;
            for(Node n : list[cur.end]) {
                if(!check[n.end] && dist[n.end] > dist[cur.end] + n.cost) {
                    dist[n.end] = dist[cur.end] + n.cost;
                    q.offer(new Node(n.end, cur.cost + n.cost));
                }
            }
        }
        for(int i = 1; i <= n; i++) {
            if(dist[i] <= m) {
                sum += arr[i];
            }
        }
        ans = Math.max(sum, ans);
    }

    static class Node implements Comparable<Node>{
        int end;
        int cost;
        Node(int end, int cost) {
            this.end = end;
            this.cost = cost;
        }

        @Override
        public int compareTo(Node o) {
            return this.cost - o.cost;
        }
    }
}
