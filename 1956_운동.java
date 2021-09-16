import java.io.*;
import java.util.*;

public class Main {
    static int v,e;
    static int[][] dist;
    static int INF = 4000001;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        v = Integer.parseInt(st.nextToken());
        e = Integer.parseInt(st.nextToken());
        dist = new int[v + 1][v + 1];
        for(int[] i : dist) {
            Arrays.fill(i, INF);
        }
        for(int i = 0; i < e; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());
            dist[start][end] = weight;
        }
        floyd();
        int answer = INF;
        for(int i = 1; i <= v; i++) { 
            answer = Math.min(dist[i][i], answer);
        }
        if(answer == INF) {
            System.out.println(-1);
        } else {
            System.out.println(answer);
        }
    }
    public static void floyd() {
        for(int k = 1; k <= v; k++) {
            for(int i = 1; i <= v; i++) {
                for(int j = 1; j <= v; j++) {
                    dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
                }
            }
        }
    }
}
