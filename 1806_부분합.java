import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int[] arr = new int[n + 1];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt((st.nextToken()));
        }
        System.out.println(solution(n, s, arr));
    }

    public static int solution(int n, int s, int[] arr) {
        int sum = 0;
        int start = 0;
        int end = 0;
        int distance = Integer.MAX_VALUE;

        while (true) {
            if(sum < s) {
                if(end >= n) {
                    break;
                }
                sum += arr[end++];
            } else {
                distance = Math.min(distance, end - start);
                sum -= arr[start++];
            }
        }
        if(distance == Integer.MAX_VALUE) return 0;
        return distance;
    }
}
