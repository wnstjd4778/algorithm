import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 랜턴의 수
        int l = Integer.parseInt(st.nextToken()); // 거리
        double maxDistance = 0; // 최대 거리
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            arr[i] = num;
        }

        Arrays.sort(arr);

        // 두 랜턴사이 최대 거리를 구함
        for(int i = 0; i < n - 1; i++) {
            if(arr[i + 1] - arr[i] > maxDistance) {
                maxDistance = arr[i + 1] - arr[i];
            }
        }
        double x = arr[0]; // 0에서 첫번째 랜턴의 거리
        double y = (double)maxDistance / 2; // 랜턴 두개 사이 거리를 밝히면 되니까 /2함
        double ans = Math.max(x, y);
        double z = l - arr[n - 1]; // 마지막 거리에서 최고 거리에 있는 랜턴 까지의 거리
        ans = Math.max(z, ans);
        System.out.println(String.format("%.10f", ans));
    }
}
