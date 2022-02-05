import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim()); // 동전의 개수
        int[] arr = new int[n]; // 동전의 값의 배열
        int sum = 0; // 모든 동전의 값의 합
        int now = 0; // 현재 가지고 있는 동전의 합

        // 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            sum += arr[i];
        }

        // 정렬을 한 뒤 모든 합에서 하나씩 동전의 값을 빼가면서 현재 동전의 합이 남은 동전의 합보다 커지면 동전의 개수를 출력한다
        Arrays.sort(arr);
        for(int i = n - 1; i >= 0; i--) {
            if(now + arr[i] > sum - arr[i]) {
                System.out.println(n - i);
                return;
            }
            now += arr[i];
            sum -= arr[i];
        }

    }
}
