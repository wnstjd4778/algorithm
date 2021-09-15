import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static class Node implements Comparable<Node> {
        int end, weight;

        @Override
        public int compareTo(Node o) {
            return weight - o.weight;
        }

        public Node(int end, int weight) {
            this.end = end;
            this.weight = weight;
        }
    }
    static int n, e, result1, result2;
    static List<Node>[] list;
    static int[] dist;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        e = Integer.parseInt(st.nextToken());
        list = new ArrayList[n + 1];
        dist = new int[n + 1];
        for(int i = 1; i <= n; i++) {
            list[i] = new ArrayList<>();
        }
        Arrays.fill(dist, 200000001);
        for(int i = 0; i < e; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());
            list[start].add(new Node(end, weight));
            list[end].add(new Node(start, weight));
        }
        st = new StringTokenizer(br.readLine());
        result1 = Integer.parseInt(st.nextToken());
        result2 = Integer.parseInt(st.nextToken());

        int res1 = 0;
        res1 += dijkstra(1, result1);
        res1 += dijkstra(result1, result2);
        res1 += dijkstra(result2, n);

        int res2 = 0;
        res2 += dijkstra(1, result2);
        res2 += dijkstra(result2, result1);
        res2 += dijkstra(result1, n);

        int ans = (res1 >= 200000000 && res2 >= 200000000) ? -1 : Math.min(res1, res2);
        
        System.out.println(ans);
    }

    public static int dijkstra(int start, int end) {
        PriorityQueue<Node> queue = new PriorityQueue<>();
        boolean[] check = new boolean[n + 1];
        Arrays.fill(dist, 200000000);
        queue.offer(new Node(start, 0));
        dist[start] = 0;
        while (!queue.isEmpty()) {
            Node curNode = queue.poll();
            int cur = curNode.end;
            if(!check[cur]) {
                check[cur] = true;
            }
            for(Node node : list[cur]) {
                if(!check[node.end] && dist[node.end] > dist[cur] + node.weight) {
                    dist[node.end] = dist[cur] + node.weight;
                    queue.offer(new Node(node.end, dist[node.end]));
                }
            }
        }
        return dist[end];
    }
}
