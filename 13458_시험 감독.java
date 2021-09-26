import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        long count = 0;
        st = new StringTokenizer(br.readLine());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        for(int i = 0; i < n; i++) {
            int num = arr[i] - b;
            if(num > 0) {
                if(num % c > 0) {
                    count += ((num / c) + 2);
                } else {
                    count += ((num / c) + 1);
                }
            } else {
                count++;
            }
        }
        System.out.println(count);
    }
}
