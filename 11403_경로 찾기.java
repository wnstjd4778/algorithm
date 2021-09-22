import java.io.*;
import java.util.*;


public class Main {

    static int n;
    static int[][] dist;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        dist = new int[n][n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++) {
                dist[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        floyd();
        System.out.println(sb);
    }

    public static void floyd() {
        for(int k = 0; k < n; k++) {
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++) {
                    if(dist[i][j] == 0) {
                        if(dist[i][k] != 0 && dist[k][j] != 0) {
                            dist[i][j] = 1;
                        }
                    }
                }
            }
        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(dist[i][j] == 0) {
                    sb.append(0).append(' ');
                } else {
                    sb.append(1).append(' ');
                }
            }
            sb.append('\n');
        }
    }
}
