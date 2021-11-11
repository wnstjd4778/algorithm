import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] liquid = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            liquid[i] = Integer.parseInt(st.nextToken());
        }
        int[] ans = new int[2];
        Arrays.sort(liquid);
        int max = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++) {
            int start = i + 1;
            int end = n - 1;
            while (start <= end) {
                int mid = (start + end) / 2;
                int sum = liquid[i] + liquid[mid];

                if(Math.abs(sum) < max) {
                    ans[0] = liquid[i];
                    ans[1] = liquid[mid];
                    max = Math.abs(sum);
                }
                if(sum < 0) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        System.out.println(ans[0] + " " + ans[1]);
    }
}
