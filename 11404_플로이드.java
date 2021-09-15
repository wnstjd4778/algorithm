import java.util.Scanner;
// 플로이드 워셜 알고리즘
public class Main {
    public static int n, m;
    public static int[][] distance;
    public static int INF = 10000000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        distance = new int[n + 1][n + 1];
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                if(i == j) {
                    distance[i][j] = 0;
                } else {
                    distance[i][j] = INF;
                }
            }
        }
        for(int i = 0; i < m; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            int weight = sc.nextInt();
            distance[start][end] = Math.min(distance[start][end], weight);
        }
        floyd();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (distance[i][j] >= INF) {
                    sb.append(0).append(' ');
                } else {
                    sb.append(distance[i][j]).append(' ');
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

    public static void floyd() {
        for(int k = 1; k <= n; k++) {
            for(int i = 1; i <= n; i++) {
                for(int j = 1; j <= n; j++) {
                    distance[i][j] = Math.min(distance[i][k] + distance[k][j], distance[i][j]);
                }
            }
        }
    }
}
