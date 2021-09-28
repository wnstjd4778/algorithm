import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int count = 0;
        int len = arr.length;
        int start = 0;
        int end = 0;
        int sum = 0;
        while (true) {
            if(sum >= m) {
                sum -= arr[start++];
            } else if(end >= len) {
                break;
            } else {
                sum += arr[end++];
            }
            if(sum == m) {
                count++;
            }
        }
        System.out.println(count);
    }
}
