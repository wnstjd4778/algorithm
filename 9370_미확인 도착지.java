import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static class Node implements Comparable<Node> {
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
    static List<Node>[] list;
    static int[] dist;
    static int v, e, t;
    static int INF = 100000000;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        while (size-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            v = Integer.parseInt(st.nextToken());
            e = Integer.parseInt(st.nextToken());
            t = Integer.parseInt(st.nextToken());
            list = new ArrayList[v + 1];
            dist = new int[v + 1];
            Arrays.fill(dist, INF);
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int g = Integer.parseInt(st.nextToken());
            int h = Integer.parseInt(st.nextToken());
            for(int i = 1; i <= v; i++) {
                list[i] = new ArrayList<>();
            }
            for(int i = 0; i < e; i++) {
                st = new StringTokenizer(br.readLine());
                int u = Integer.parseInt(st.nextToken());
                int v = Integer.parseInt(st.nextToken());
                int weight = Integer.parseInt(st.nextToken());
                // gh간선만 홀수를 넣고 나머지는 짝수를 넣어 최소거리가 홀수가 나오면 gh간선이 포함한거다.
                if((u == g && v == h) || (u == h && v == g)) {
                    list[u].add(new Node(v, weight * 2 + 1));
                    list[v].add(new Node(u, weight * 2 + 1));
                } else {
                    list[u].add(new Node(v, weight * 2));
                    list[v].add(new Node(u, weight * 2));
                }
            }
            ArrayList<Integer> candidate = new ArrayList<>();
            for(int j = 0; j < t; j++) {
                candidate.add(Integer.valueOf(br.readLine()));
            }
            dijkstra(start);
            Collections.sort(candidate);
            for(int num : candidate) {
                if(dist[num] % 2 == 1) {
                    System.out.print(num + " ");
                }
            }
            System.out.println();
        }
    }

    public static void dijkstra(int start) {
        boolean[] visit = new boolean[v + 1];
        PriorityQueue<Node> q = new PriorityQueue<>();
        dist[start] = 0;
        q.offer(new Node(start, 0));
        while (!q.isEmpty()) {
            Node curNode = q.poll();
            int cur = curNode.end;
            if(!visit[cur]) {
                visit[cur] = true;

                for(Node node : list[cur]) {
                    if(!visit[node.end] && dist[node.end] > dist[cur] + node.weight) {
                        dist[node.end] = dist[cur] + node.weight;
                        q.offer(new Node(node.end, dist[node.end]));
                    }
                }
            }
        }
    }
}
