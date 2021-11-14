import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n][m];
        long sum = 0;
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                sum += arr[i][j];
            }
        }
        long ans = 0;
        boolean[][] check = new boolean[n][m];
        for(int i = 0; i < n; i++) {
            int max = 0;
            int index = 0;
            for(int j = 0; j < m; j++) {
                if(max < arr[i][j]) {
                    max = arr[i][j];
                    index = j;
                }
            }
            if(!check[i][index]) {
                ans += arr[i][index];
                check[i][index] = true;
            }
        }
        for(int i = 0; i < m; i++) {
            int max = 0;
            int index = 0;
            for(int j = 0; j < n; j++) {
                if(max < arr[j][i]) {
                    max = arr[j][i];
                    index = j;
                }
            }
            if(!check[index][i]) {
                ans += arr[index][i];
                check[index][i] = true;
            }
        }
        System.out.println(sum - ans);
    }
}
