import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int day = 1;
        int max = 0;
        for(int i = arr.length - 1; i >= 0; i--) {
            int num = arr[i] + day;
            max = Math.max(max, num);
            day++;
        }
        System.out.println(max + 1);
    }
}



