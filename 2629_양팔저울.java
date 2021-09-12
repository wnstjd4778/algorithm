import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static int[] arr1;

    public static int n;
    public static boolean[][] result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        result = new boolean[n + 1][40001];
        arr1 = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            arr1[i] = Integer.parseInt(st.nextToken());
        }
        dp(0, 0);
        int m = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < m; i++) {
            int t = Integer.parseInt(st.nextToken());
            if(result[n][t]) {
                sb.append("Y ");
            } else {
                sb.append("N ");
            }
        }
        System.out.println(sb);
    }

    public static void dp(int count, int num) {
        if(result[count][num]) {
            return;
        }
        result[count][num] = true;
        if(count == n) {
            return;
        }
        dp(count + 1, num + arr1[count]); // 추를 구슬 없을 쪽에 올릴 경우
        dp(count + 1, num); // 추를 안 넣을 경우
        dp(count + 1, Math.abs(num - arr1[count])); // 추를 구슬 있는 쪽에 올릴 경우
    }
}
