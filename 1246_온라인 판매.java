import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[m];
        for(int i = 0; i < m; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        int price = -1;
        int max = 0;
        for(int i = m - 1, j = 1; i >= 0; i--, j++) {
            if(max < j * arr[i] && j <= n) {
                max = j * arr[i];
                price = arr[i];
            }
        }
        System.out.println(price + " " + max);
    }
}
