import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    static class Edge implements Comparable<Edge> {

        int start;
        int end;
        int weight;

        Edge(int start, int end, int weight) {
            this.start = start;
            this.end = end;
            this.weight = weight;
        }

        @Override
        public int compareTo(Edge o) {
            return weight - o.weight;
        }
    }

    static int[] parent;
    static ArrayList<Edge> edgeList;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        edgeList = new ArrayList<>();
        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());

            edgeList.add(new Edge(s, e, w));
        }

        parent = new int[n + 1];
        for(int i = 1; i <= n; i++) {
            parent[i] = i;
        }

        Collections.sort(edgeList);

        int ans = 0;
        for(int i = 0; i < edgeList.size(); i++) {
            Edge edge = edgeList.get(i);

            if(find(edge.start) != find(edge.end)) {
                ans += edge.weight;
                union(edge.start, edge.end);
            }
        }

        System.out.println(ans);
    }

    public static int find(int x) {
        if(x == parent[x]) {
            return x;
        }

        return parent[x] = find(parent[x]);
    }

    public static void union(int x, int y) {
        x = find(x);
        y = find(y);

        if(x != y) {
            parent[y] = x;
        }
    }
}
