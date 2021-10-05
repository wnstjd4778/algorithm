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
        Arrays.sort(arr);
        double left = arr[0] - 0.5;
        int cnt = 1;
        for(int i = 0; i < n; i++) {
            if(left + m < arr[i]) {
                cnt++;
                left = arr[i] - 0.5;
            }
        }
        System.out.println(cnt);
    }
}


