import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[7];
        arr[n]++;
        arr[m]++;
        arr[k]++;
        int ans = 0;
        for(int i = 1; i <= 6; i++) {
            if(arr[i] == 3) {
                ans = Math.max(ans, 10000 + i * 1000);
            } else if(arr[i] == 2) {
                ans = Math.max(ans, 1000 + 100 * i);
            } else if(arr[i] == 1) {
                ans = Math.max(ans, 100 * i);
            }
        }
        System.out.println(ans);
    }
}
