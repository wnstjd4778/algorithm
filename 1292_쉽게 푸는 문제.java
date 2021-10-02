import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[2000];
        int k = 1;
        for(int i = 1; i <= 50; i++) {
            for(int j = 0; j < i; j++) {
                arr[k + j] = i;
            }
            k += i;
        }
        int sum = 0;
        for(int i = n; i <= m; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}


