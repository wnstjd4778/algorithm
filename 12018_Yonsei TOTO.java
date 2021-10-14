import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int count = 0;
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if(b > a) {
                m--;
                if(m >= 0) {
                    count++;
                }
                br.readLine();
            } else {
                st = new StringTokenizer(br.readLine());
                int[] val = new int[a];
                for(int j = 0; j < a; j++) {
                    val[j] = Integer.parseInt(st.nextToken());
                }
                Arrays.sort(val);
                arr[i] = val[a - b];
            }
        }
        Arrays.sort(arr);
        for(int i = 0; i < n; i++) {
            if(arr[i] != 0 && m >= 0) {
                m -= arr[i];
                if(m >= 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
