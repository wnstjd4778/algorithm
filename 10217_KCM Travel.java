import java.io.*;
import java.util.*;

public class Main {
    public static class Node implements Comparable<Node> {
        int end, cost, time;

        @Override
        public int compareTo(Node o) {
            if(this.time < o.time) {
                return -1;
            }
            else if(this.time == o.time) {
                if(this.cost < o.cost) {
                    return -1;
                }
                return 0;
            }
            return 1;
        }
        public Node(int end, int cost, int time) {
            this.end = end;
            this.cost = cost;
            this.time = time;
        }
    }
    static int n, m, k;
    static List<Node>[] list;
    static int[][] dist;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        while (size-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());
            list = new ArrayList[n + 1];
            dist = new int[n + 1][m + 1];
            for(int i = 1; i <= n; i++) {
                list[i] = new ArrayList<>();
                Arrays.fill(dist[i], Integer.MAX_VALUE);
            }
            for(int i = 0; i < k; i++) {
                st = new StringTokenizer(br.readLine());
                int start = Integer.parseInt(st.nextToken());
                int end = Integer.parseInt(st.nextToken());
                int cost = Integer.parseInt(st.nextToken());
                int time = Integer.parseInt(st.nextToken());
                list[start].add(new Node(end, cost, time));
            }
            dijkstra(1);
            int min = Integer.MAX_VALUE;
            for(int i = 0; i <= m; i++) {
                min = Math.min(min, dist[n][i]);
            }

            if(min == Integer.MAX_VALUE) {
                System.out.println("Poor KCM");
            } else {
                System.out.println(min);
            }
        }
    }

    public static void dijkstra(int start) {
        PriorityQueue<Node> q = new PriorityQueue<>();
        q.offer(new Node(start, 0, 0));
        dist[start][0] = 0;
        while (!q.isEmpty()) {
            Node curNode = q.poll();
            int curEnd = curNode.end;
            int curCost = curNode.cost;
            int curTime = curNode.time;
            if(curEnd == n) { // ??????????????? ?????? ??????
               break;
            }
            for(Node node : list[curEnd]) {
                int nextEnd = node.end;
                int nextCost = node.cost + curCost;
                int nextTime = node.time + curTime;
                if(nextCost > m) { // ??????????????? ????????? ???????????? ?????? ?????? ????????? ??????
                    continue;
                }
                if(dist[nextEnd][nextCost] <= nextTime) { // ?????? ????????? ????????? ??? ?????? ?????? ????????? 
                    continue;
                }
                for(int j = nextCost; j <= m; j++) { // ?????? ????????? ?????? ????????? ???
                    if(dist[nextEnd][j] > nextTime) {
                        dist[nextEnd][j] = nextTime;
                    }
                }
                dist[node.end][nextCost] = nextTime;
                q.offer(new Node(node.end, nextCost, nextTime));
            }
        }
    }
}
