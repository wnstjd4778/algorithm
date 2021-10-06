import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int result = -1;
        for(int i = 0; i < n; i++) {
            count = 0;
            for(int j = i + 1; j < n; j++) {
                if(arr[i] > arr[j]) count++;
                else break;
            }
            result = Math.max(result, count);
        }
        System.out.println(result);
    }
}


