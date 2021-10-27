import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int count = 0;
        int ans = 0;
        boolean flag = false;
        for(int i = n - 1; i >= 0; i--) {
            count += arr[i];
            ans++;
            if(count >= m * k) {
                flag = true;
                break;
            }
        }
        if(flag) {
            System.out.println(ans);
        } else {
            System.out.println("STRESS");
        }
    }
}
