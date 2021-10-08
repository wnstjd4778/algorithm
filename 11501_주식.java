import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
            int m = Integer.parseInt(br.readLine());
            int[] arr = new int[m + 1];
            StringTokenizer st = new StringTokenizer(br.readLine());
            long sum = 0;
            int max = 0;
            for(int j = 0; j < m; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            for(int j = m - 1; j >= 0; j--) {
                if(arr[j] > max) {
                    max = arr[j];
                } else {
                    sum += (max - arr[j]);
                }
            }
            sb.append(sum).append('\n');
        }
        System.out.println(sb);
    }
}



