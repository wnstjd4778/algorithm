import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int max = 0;
        int min = Integer.MAX_VALUE;
        int[][] arr = new int[n][m];
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                max = Math.max(max, arr[i][j]);
                min = Math.min(min, arr[i][j]);
            }
        }
        int time1 = 0;
        int index = -1;
        int count = 0;
        int time = Integer.MAX_VALUE;
        for(int k = min; k <= max; k++){
            time1 = 0;
            count = b;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    int diff = arr[i][j] - k;
                    if(diff < 0) {
                        time1 += Math.abs(diff);
                        count -= Math.abs(diff);
                    }
                    if(diff > 0) {
                        time1 += Math.abs(diff) * 2;
                        count += Math.abs(diff);
                    }
                }
            }
            if(count >= 0 && time >= time1) {
                index = k;
                time = time1;
            }
        }
        System.out.println(time + " " + index);
    }
}
