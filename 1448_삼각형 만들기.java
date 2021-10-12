import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            arr[i] = num;
        }
        Arrays.sort(arr);
        int ans = -1;
        for(int i = n - 1; i >= 2; i--) {
            if(arr[i] < arr[i - 1] + arr[i - 2]) {
                ans = arr[i] + arr[i - 1] + arr[i - 2];
                break;
            }
        }
        System.out.println(ans);
    }
}
