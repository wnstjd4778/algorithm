import java.io.*;
import java.util.*;


public class Main {
    static class Node implements Comparable<Node> {
        int end, cost;

        @Override
        public int compareTo(Node o) {
            return this.cost - o.cost;
        }

        Node(int end, int cost) {
            this.end = end;
            this.cost = cost;
        }
    }
    static int n,m;
    static LinkedList<Node>[] list;
    static int[] dist;
    static int INF = 100000 * 100000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());
        list = new LinkedList[n + 1];
        dist = new int[n + 1];
        Arrays.fill(dist, INF);
        for(int i = 1; i <= n; i++) {
            list[i] = new LinkedList<>();
        }
        StringTokenizer st = null;
        for(int i = 0; i < m; i++) {
            st= new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            list[start].add(new Node(end, cost));
        }
        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        System.out.println(dijkstra(x, y));
    }

    public static int dijkstra(int start, int end) {
        PriorityQueue<Node> q = new PriorityQueue<>();
        dist[start] = 0;
        boolean[] check = new boolean[n + 1];
        q.offer(new Node(start, 0));
        while (!q.isEmpty()) {
            Node curNode = q.poll();
            int cur = curNode.end;
            if(!check[cur]) {
                check[cur] = true;

                for(Node node : list[cur]) {
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
