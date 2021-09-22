import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int INF = 1000000000;
        int[][] data = new int[n][n];
        for(int i = 0; i < data.length; i++) {
            for(int j = 0; j < data[i].length; j++){
                if(i == j) {
                    data[i][j] = 0;
                } else {
                    data[i][j] = INF;
                }
            }
        }
        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()) - 1;
            int b = Integer.parseInt(st.nextToken()) - 1;
            data[a][b] = 1;
            data[b][a] = 1;
        }
        System.out.println(solution(n, data));
    }

    public static int solution(int n, int[][] data) {
        for(int k = 0; k < data.length; k++) {
            for(int i = 0; i < data.length; i++) {
                for(int j = 0; j < data[i].length; j++) {
                    data[i][j] = Math.min(data[i][j], data[i][k] + data[k][j]);
                }
            }
        }
        int[] result = new int[data.length];
        int idx = 0;
        for(int i = 0; i < data.length; i++) {
            result[i] = 0;

            for(int val : data[i]) {
                result[i] += val;
            }
            if(result[idx] > result[i]) {
                idx = i;
            }
        }
        return idx + 1;
    }
}
