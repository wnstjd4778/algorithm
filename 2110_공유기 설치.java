import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        int distance = 0;
        int start = 1;
        int end = arr[n - 1] - arr[0];
        while (start <= end) {
            int mid = (start + end) / 2;
            int count = 1;
            int index = arr[0];
            for(int i = 0; i < n; i++) {
                distance = arr[i] - index;
                // distance가 mid보다 크거나 같으면 카운트를 올리고 인덱스를 arr[i]로 초기화한다.
                if(distance >= mid) {
                    count++;
                    index = arr[i];
                }
            }
            if(count >= c) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        System.out.println(end);
    }
}
