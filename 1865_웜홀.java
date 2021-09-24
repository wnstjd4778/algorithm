import java.io.*;
import java.util.*;


public class Main {

    static class Edge {
        int v, w;
        Edge(int v, int w) {
            this.v = v;
            this.w = w;
        }
    }

    static int n;
    static LinkedList<Edge>[] list;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int tc = Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();

        while (tc-- > 0) {
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            list = new LinkedList[n + 1];
            for(int i = 1; i <= n; i++) {
                list[i] = new LinkedList<>();
            }
            for(int i = 0; i < m + w; i++) {
                st = new StringTokenizer(br.readLine());
                int s = Integer.parseInt(st.nextToken());
                int e = Integer.parseInt(st.nextToken());
                int t = Integer.parseInt(st.nextToken());

                if(i < m) {
                    list[s].add(new Edge(e, t));
                    list[e].add(new Edge(s, t));
                } else {
                    list[s].add(new Edge(e, -t));
                }
            }
            boolean cycle = false;
            for(int i = 1; i <= n; i++) {
                if(bellmanFord(i)) {
                    cycle = true;
                    sb.append("YES").append('\n');
                    break;
                }
            }
            if(!cycle) {
                sb.append("NO").append('\n');
            }
        }
        System.out.println(sb);
    }

    static boolean bellmanFord(int start) {
        int dist[] = new int[n + 1];
        Arrays.fill(dist, 987654321);
        dist[start] = 0;
        boolean update = false;

        for(int i = 1; i < n; i++) {
            update = false;
            for(int j = 1; j <= n; j++) {
                for(Edge edge : list[j]) {
                    if(dist[j] != 987654321 && dist[edge.v] > dist[j] + edge.w) {
                        dist[edge.v] = dist[j] + edge.w;
                        update = true;
                    }
                }
            }
            if(!update) {
                break;
            }
        }
        if(update) {
            for(int i = 1; i <= n; i++) {
                for(Edge edge : list[i]) {
                    if(dist[i] != 987654321 && dist[edge.v] > dist[i] + edge.w) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
