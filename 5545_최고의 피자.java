import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int nKcal = Integer.parseInt(br.readLine());
        int[] arr = new int[count];
        for(int i = 0; i < count; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int ans = nKcal;
        Arrays.sort(arr);
        for(int i = count - 1; i >= 0; i--) {
            if(ans / n <= arr[i] / m) {
                n += m;
                ans += arr[i];
            } else {
                break;
            }
        }
        System.out.println(ans / n);
    }
}
