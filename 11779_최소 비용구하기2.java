import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    static class Node implements Comparable<Node> {
        int end, cost, depth;

        @Override
        public int compareTo(Node o) {
            return cost - o.cost;
        }

        public Node(int end, int cost, int depth) {
            this.end = end;
            this.cost = cost;
            this.depth = depth;
        }
    }

    static int n, m;
    static List<Node>[] list;
    static int[] dist;
    static int[] route;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());
        list = new ArrayList[n + 1];
        dist = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        for(int i = 1; i <= n; i++) {
            list[i] = new ArrayList<>();
        }
        for(int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            list[start].add(new Node(end, cost, 0));
        }
        StringTokenizer st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());
        route = new int[500000];
        Arrays.fill(route, -1);
        dijkstra(start, end);

    }
    public static void dijkstra(int start, int end) {
        PriorityQueue<Node> q = new PriorityQueue<>();
        q.offer(new Node(start, 0, 0));
        boolean[] check = new boolean[n + 1];
        dist[start] = 0;
        while (!q.isEmpty()) {
            Node curNode = q.poll();
            int cur = curNode.end;
            if(cur == end) {
                sb.append(curNode.cost).append('\n');
                sb.append(curNode.depth + 1).append('\n');
                print(end);
                System.out.println(sb);
                return;
            }
            if(!check[cur]) {
                check[cur] = true;

                for(Node node : list[cur]) {
                    if(!check[node.end] && dist[node.end] > dist[cur] + node.cost) {
                        dist[node.end] = dist[cur] + node.cost;
                        q.offer(new Node(node.end, dist[node.end], curNode.depth + 1));
                        route[node.end] = cur;
                    }
                }
            }
        }
    }

    // route 재귀함수를 통해 거쳤던 노드를 sb에 넣음
    public static void print(int n) {
        if(route[n] > -1) {
            print(route[n]);
        }
        sb.append(n).append(' ');
    }

}
