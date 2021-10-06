import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        if(m >= n) {
            System.out.println(0);
            return;
        }
        int[] censor = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            int temp = Integer.parseInt(st.nextToken());
            censor[i] = temp;
        }
        Arrays.sort(censor);
        int[] dif = new int[n - 1];
        for(int i = 0; i < n - 1; i++) {
            dif[i] = censor[i + 1] - censor[i];
        }
        Arrays.sort(dif);
        int ans = 0;
        for(int i = 0; i < n - m; i++) {
            ans += dif[i];
        }
        System.out.println(ans);
    }
}


