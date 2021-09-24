import java.io.*;
import java.util.*;


public class Main {

    static class Node implements Comparable<Node> {
        int end, cost;

        public Node(int end, int cost) {
            this.end = end;
            this.cost = cost;
        }
        @Override
        public int compareTo(Node o) {
            return this.cost - o.cost;
        }
    }
    static int n, m, x;
    static List<Node>[] list;
    static int[] dist;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        x = Integer.parseInt(st.nextToken());
        list = new List[n + 1];
        dist = new int[n + 1];
        for(int i = 1; i <= n; i++) {
            list[i] = new ArrayList<>();
        }
        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            list[start].add(new Node(end, cost));
        }
        int max = 0;
        for(int i = 1; i <= n; i++) {
            int num = dijkstra(i, x) + dijkstra(x, i);
            max = Math.max(max, num);
        }
        System.out.println(max);
    }

    public static int dijkstra(int start, int end) {
        PriorityQueue<Node> q = new PriorityQueue<>();
        q.offer(new Node(start, 0));
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[start] = 0;
        boolean[] check = new boolean[n + 1];
        while (!q.isEmpty()) {
            Node curNode = q.poll();
            int cur = curNode.end;
            if(!check[cur]) {
                check[cur] = true;
                for (Node node : list[cur]) {
                    if(!check[node.end] && dist[node.end] > dist[cur] + node.cost) {
                        dist[node.end] = dist[cur] + node.cost;
                        q.offer(new Node(node.end, dist[node.end]));
                    }
                }
            }
        }
        return dist[end];
    }
}
